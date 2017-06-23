package com.epam.javacc.microservices.common.config;

import com.netflix.config.ConfigurationManager;
import com.netflix.config.DynamicIntProperty;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

import java.io.IOException;

public class PropertyReaderImpl implements PropertyReader {

    private static final String UNDEFINED = "undefined";

    public PropertyReaderImpl() {
    }

    public PropertyReaderImpl(String... configFiles) {
        for (String configFile : configFiles) {

            try {
                ConfigurationManager.loadCascadedPropertiesFromResources(configFile);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
    }

    @Override
    public String getStringProperty(String propName) {
        DynamicPropertyFactory dynamicPropertyFactory = DynamicPropertyFactory.getInstance();
        DynamicStringProperty property = dynamicPropertyFactory.getStringProperty(propName, UNDEFINED);
        return property.get();
    }

    @Override
    public int getIntProperty(String propName) {
        DynamicPropertyFactory dynamicPropertyFactory = DynamicPropertyFactory.getInstance();
        DynamicIntProperty intProperty = dynamicPropertyFactory.getIntProperty(propName, -1);
        return intProperty.get();
    }
}
