package com.example.RedirectApplication;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties(CustomPortConfig.class)
@ConfigurationProperties(prefix = "custom")
public class CustomPortConfig {

    private int port = 8081; // Set the default port

    // Getter and setter for the custom port
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
