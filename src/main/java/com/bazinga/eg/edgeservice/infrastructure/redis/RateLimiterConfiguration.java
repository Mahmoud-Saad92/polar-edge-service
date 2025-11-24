package com.bazinga.eg.edgeservice.infrastructure.redis;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

public class RateLimiterConfiguration {

    @Bean
    public KeyResolver keyResolver() {
        return exchange -> Mono.just("anonymous");
    }
}
