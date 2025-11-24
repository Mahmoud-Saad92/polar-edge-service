package com.bazinga.eg.edgeservice.common.web;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class WebEndpoint {

    @Bean
    public RouterFunction<@NotNull ServerResponse> routerFunction() {
        return RouterFunctions.route()
                .GET("/catalog-fallback", request -> ServerResponse.ok().body(Mono.just("fallback for: " + request.path()), String.class))
                .POST("/catalog-fallback", request -> ServerResponse.status(HttpStatus.SERVICE_UNAVAILABLE).build())
                .build();
    }
}
