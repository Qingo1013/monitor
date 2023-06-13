package cn.qqa.monitor.conf;


import cn.qqa.monitor.pkg.shiro.SPBModularRealmAuthenticator;
import cn.qqa.monitor.pkg.shiro.realm.ThirdAccessRealm;
import cn.qqa.monitor.pkg.shiro.realm.UsernamePasswordRealm;
import net.sf.ehcache.CacheManager;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.io.ResourceUtils;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * @author qingo
 * @Bean修饰的方法参数的注入方式: 方法参数默认注入方式为Autowired,
 * 即先根据类型匹配,若有多个在根据名称进行匹配.
 * 1:复杂类型可以通过@Qualifier(value=“XXX”)限定;
 * 2:对于普通类型使用@Value(XXX)指定;
 **/
@Configuration
public class ShiroConfiguration {
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultSecurityManager defaultSecurityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // 设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(defaultSecurityManager);

        // 设置过滤链
        LinkedHashMap<String, String> filterMap = new LinkedHashMap<>();
//        filterMap.put("/comment", "authc");
        filterMap.put("/update", "perms[user:update]");
        filterMap.put("/user/login", "anon");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

        // 跳转页面通过状态码让前端处理
        // 设置登录地址
//        shiroFilterFactoryBean.setLoginUrl("/user/login");
        // 设置未授权提示地址
//        shiroFilterFactoryBean.setUnauthorizedUrl("/unAuthorization");

        return shiroFilterFactoryBean;
    }

    @Bean(name = {"defaultSecurityManager"})
    public DefaultWebSecurityManager getDefaultSecurityManager(UsernamePasswordRealm userRealm, ThirdAccessRealm thirdAccessRealm, EhCacheManager ehCacheManager) {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        /** 设置认证器和授权器 */
        SPBModularRealmAuthenticator modularRealmAuthenticator = new SPBModularRealmAuthenticator();
        ModularRealmAuthorizer modularRealmAuthorizer = new ModularRealmAuthorizer();
        // Authenticator关联realm
        modularRealmAuthenticator.setRealms(new ArrayList<Realm>() {{
            add(userRealm);
            add(thirdAccessRealm);
        }});
        // Authorizer关联realm
        modularRealmAuthorizer.setRealms(new ArrayList<Realm>() {{
            add(userRealm);
        }});
        defaultWebSecurityManager.setAuthenticator(modularRealmAuthenticator);
        defaultWebSecurityManager.setAuthorizer(modularRealmAuthorizer);
        /** 设置认证器和授权器 */

        //设置缓存管理器
        defaultWebSecurityManager.setCacheManager(ehCacheManager);
        return defaultWebSecurityManager;
    }

    /**
     * LifecycleBeanPostProcessor 是管理shiro生命周期的
     */
    @Bean
    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    /**
     * AuthorizationAttributeSourceAdvisor 的作用是匹配所有类 匹配所有加认证注解的方法
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("defaultSecurityManager") DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    //缓存管理器
    @Bean(name = {"EhCacheManager"})
    public EhCacheManager getEhCacheManager() {
        EhCacheManager ehCacheManager = new EhCacheManager();
        InputStream is = null;
        try {
            is = ResourceUtils.getInputStreamForPath(
                "classpath:ehcache/ehcache-shiro.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        CacheManager cacheManager = new CacheManager(is);
        ehCacheManager.setCacheManager(cacheManager);
        return ehCacheManager;
    }

    @Bean(name = {"usernamePasswordRealm"})
    public UsernamePasswordRealm getUserRealm() {
        return new UsernamePasswordRealm();
    }


    @Bean(name = {"thirdAccessRealm"})
    public ThirdAccessRealm getThirdAccessRealm() {
        return new ThirdAccessRealm();
    }
}
