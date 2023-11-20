package com.jierui.boot.module.infra.framework.web.config;

import com.jierui.boot.framework.swagger.config.JieruiSwaggerAutoConfiguration;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * infra 模块的 web 组件的 Configuration
 *
 * @author 张杰瑞
 */
@Configuration(proxyBeanMethods = false)
public class InfraWebConfiguration {

    /**
     * infra 模块的 API 分组
     */
    @Bean
    public GroupedOpenApi infraGroupedOpenApi() {
        return JieruiSwaggerAutoConfiguration.buildGroupedOpenApi("infra");
    }

}
