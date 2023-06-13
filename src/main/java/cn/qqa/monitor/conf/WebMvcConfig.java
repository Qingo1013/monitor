package cn.qqa.monitor.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 *
 * @author qingo
 * @date 2022/12/22 18:34
 */


@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    /**
     * swagger页面404
     * https://blog.csdn.net/weixin_43702146/article/details/118442537?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_baidulandingword~default-0-118442537-blog-120807974.pc_relevant_aa2&spm=1001.2101.3001.4242.1&utm_relevant_index=2
     * @author qingo
     * @date 2022/12/23 10:06
     **/
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        super.addResourceHandlers(registry);

    }
}
