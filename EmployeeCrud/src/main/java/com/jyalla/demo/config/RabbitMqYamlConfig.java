package com.jyalla.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("rabbitmq")
public class RabbitMqYamlConfig {
    private String exchange;
    private String queue;
    private String router;

    public RabbitMqYamlConfig(String exchange, String queue, String router) {
        super();
        this.exchange = exchange;
        this.queue = queue;
        this.router = router;
    }

    public RabbitMqYamlConfig() {
        super();
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getrouter() {
        return router;
    }

    public void setrouter(String router) {
        this.router = router;
    }

    @Override
    public String toString() {
        return "RabbitMqYamlConfig [exchange=" + exchange + ", queue=" + queue + ", router=" + router + "]";
    }

}
