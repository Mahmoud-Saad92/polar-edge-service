package com.bazinga.eg.edgeservice.infrastructure;

import com.bazinga.eg.edgeservice.infrastructure.redis.RateLimiterConfiguration;
import org.springframework.context.annotation.Import;

@Import({RateLimiterConfiguration.class})
public class InfrastructureConfiguration {
}
