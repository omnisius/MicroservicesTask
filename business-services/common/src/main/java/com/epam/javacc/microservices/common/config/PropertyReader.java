package com.epam.javacc.microservices.common.config;

public interface PropertyReader {

    String getStringProperty(String propName);

    int getIntProperty(String propName);
}
