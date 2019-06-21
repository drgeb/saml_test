package com.example.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ConfigurationProperties(prefix = "spring.security.saml2")
@Configuration
public class SamlAppConfig extends SamlServerConfiguration {
}