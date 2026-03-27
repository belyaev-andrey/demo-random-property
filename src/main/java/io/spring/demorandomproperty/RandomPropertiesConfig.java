package io.spring.demorandomproperty;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "some.random")
public class RandomPropertiesConfig {

    private int property;

    public int getProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property = property;
    }

}
