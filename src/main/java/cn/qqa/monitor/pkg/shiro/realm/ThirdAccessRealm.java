package cn.qqa.monitor.pkg.shiro.realm;

import cn.qqa.monitor.pkg.shiro.token.ZJUThirdAccessToken;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author MrLi
 * @date 2023-02-17 17:11
 **/
public class ThirdAccessRealm extends AuthorizingRealm {
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }


    @Override
    public boolean supports(AuthenticationToken token) {
        return super.supports(token) && ZJUThirdAccessToken.class.isAssignableFrom(token.getClass());
    }
}
