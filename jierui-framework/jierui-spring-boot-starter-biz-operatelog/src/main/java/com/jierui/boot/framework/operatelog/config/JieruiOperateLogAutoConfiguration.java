package com.jierui.boot.framework.operatelog.config;

import com.jierui.boot.framework.operatelog.core.aop.OperateLogAspect;
import com.jierui.boot.framework.operatelog.core.service.OperateLogFrameworkService;
import com.jierui.boot.framework.operatelog.core.service.OperateLogFrameworkServiceImpl;
import com.jierui.boot.module.system.api.logger.OperateLogApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class JieruiOperateLogAutoConfiguration {

    @Bean
    public OperateLogAspect operateLogAspect() {
        return new OperateLogAspect();
    }

    @Bean
    public OperateLogFrameworkService operateLogFrameworkService(OperateLogApi operateLogApi) {
        return new OperateLogFrameworkServiceImpl(operateLogApi);
    }

}
