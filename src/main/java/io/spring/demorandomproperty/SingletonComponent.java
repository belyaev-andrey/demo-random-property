package io.spring.demorandomproperty;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class SingletonComponent {

    private final RandomPropertiesConfig randomPropertiesConfig;

    SingletonComponent(RandomPropertiesConfig randomPropertiesConfig) {
        this.randomPropertiesConfig = randomPropertiesConfig;
    }

    public int getRandomProperty() {
        return randomPropertiesConfig.getProperty();
    }

}
