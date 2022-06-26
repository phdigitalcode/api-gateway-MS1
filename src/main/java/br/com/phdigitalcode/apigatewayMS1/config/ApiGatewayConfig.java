package br.com.phdigitalcode.apigatewayMS1.config;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {
 public RouteLocator routeLocator(RouteLocatorBuilder builder) {
	 return builder.routes()
			 .route(p->p.path("/get")
			 		.uri(""))
			 .build();
 }
}
