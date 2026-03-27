package io.spring.demorandomproperty;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeComponent {

    private final RandomPropertiesConfig randomPropertiesConfig;

    PrototypeComponent(RandomPropertiesConfig randomPropertiesConfig) {
        this.randomPropertiesConfig = randomPropertiesConfig;
    }

    public int getRandomNumber() {
        return randomPropertiesConfig.getProperty();
    }

}
