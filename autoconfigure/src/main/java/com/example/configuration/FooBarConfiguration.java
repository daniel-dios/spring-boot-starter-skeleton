package com.example.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
public class FooBarConfiguration {

    @Bean
    public void setProperties() {
        System.setProperty("foo", "bar");
    }
}

