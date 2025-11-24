package com.bazinga.eg.edgeservice.common;

import com.bazinga.eg.edgeservice.common.web.WebEndpoint;
import com.bazinga.eg.edgeservice.infrastructure.InfrastructureConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({WebEndpoint.class, InfrastructureConfiguration.class})
public class ApplicationConfiguration {

}
