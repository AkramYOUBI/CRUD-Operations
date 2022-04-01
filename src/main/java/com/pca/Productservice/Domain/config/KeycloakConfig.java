package com.pca.Productservice.Domain.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* Here, keycloakConfigResolver defines that we want to use the Spring Boot properties file
* support instead of the default keycloak.json. Since we set up the security constraints with
* Spring Security, we can remove or comment these security constraints we placed earlier in the properties file
* */

@Configuration
public class KeycloakConfig {
    @Bean
    public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }
}
