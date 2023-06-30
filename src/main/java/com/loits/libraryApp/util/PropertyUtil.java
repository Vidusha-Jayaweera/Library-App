package com.loits.libraryApp.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class PropertyUtil {
    @Value("${welcome.message}")
    private String welcomeMessage;
    @Value("${welcome.description}")
    private String welcomeDescription;

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String getWelcomeDescription() {
        return welcomeDescription;
    }
}
