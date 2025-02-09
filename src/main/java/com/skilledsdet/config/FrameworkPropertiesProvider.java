package com.skilledsdet.config;

import org.aeonbits.owner.ConfigFactory;

public class FrameworkPropertiesProvider {

    public final static FrameworkProperties FRAMEWORK_PROPERTIES = ConfigFactory.create(FrameworkProperties.class);
}
