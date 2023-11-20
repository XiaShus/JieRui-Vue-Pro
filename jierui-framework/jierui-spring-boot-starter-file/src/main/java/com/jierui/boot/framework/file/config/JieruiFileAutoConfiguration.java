package com.jierui.boot.framework.file.config;

import com.jierui.boot.framework.file.core.client.FileClientFactory;
import com.jierui.boot.framework.file.core.client.FileClientFactoryImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 文件配置类
 *
 * @author 张杰瑞
 */
@AutoConfiguration
public class JieruiFileAutoConfiguration {

    @Bean
    public FileClientFactory fileClientFactory() {
        return new FileClientFactoryImpl();
    }

}
