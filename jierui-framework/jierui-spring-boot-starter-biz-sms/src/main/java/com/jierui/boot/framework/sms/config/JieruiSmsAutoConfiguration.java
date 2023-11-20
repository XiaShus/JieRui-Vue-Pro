package com.jierui.boot.framework.sms.config;

import com.jierui.boot.framework.sms.core.client.SmsClientFactory;
import com.jierui.boot.framework.sms.core.client.impl.SmsClientFactoryImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 短信配置类
 *
 * @author 张杰瑞
 */
@AutoConfiguration
public class JieruiSmsAutoConfiguration {

    @Bean
    public SmsClientFactory smsClientFactory() {
        return new SmsClientFactoryImpl();
    }

}
