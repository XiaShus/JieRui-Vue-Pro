package com.jierui.boot.framework.idempotent.config;

import com.jierui.boot.framework.idempotent.core.aop.IdempotentAspect;
import com.jierui.boot.framework.idempotent.core.keyresolver.impl.DefaultIdempotentKeyResolver;
import com.jierui.boot.framework.idempotent.core.keyresolver.impl.ExpressionIdempotentKeyResolver;
import com.jierui.boot.framework.idempotent.core.keyresolver.IdempotentKeyResolver;
import com.jierui.boot.framework.idempotent.core.redis.IdempotentRedisDAO;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import com.jierui.boot.framework.redis.config.JieruiRedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

@AutoConfiguration(after = JieruiRedisAutoConfiguration.class)
public class JieruiIdempotentConfiguration {

    @Bean
    public IdempotentAspect idempotentAspect(List<IdempotentKeyResolver> keyResolvers, IdempotentRedisDAO idempotentRedisDAO) {
        return new IdempotentAspect(keyResolvers, idempotentRedisDAO);
    }

    @Bean
    public IdempotentRedisDAO idempotentRedisDAO(StringRedisTemplate stringRedisTemplate) {
        return new IdempotentRedisDAO(stringRedisTemplate);
    }

    // ========== 各种 IdempotentKeyResolver Bean ==========

    @Bean
    public DefaultIdempotentKeyResolver defaultIdempotentKeyResolver() {
        return new DefaultIdempotentKeyResolver();
    }

    @Bean
    public ExpressionIdempotentKeyResolver expressionIdempotentKeyResolver() {
        return new ExpressionIdempotentKeyResolver();
    }

}
