package com.skilledsdet.config;

import com.skilledsdet.BrowserFactory;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:config.properties"})
public interface FrameworkProperties extends Config {

    @Key("base.url")
    String baseUrl();
    BrowserFactory browser();
    int timeout();
}
