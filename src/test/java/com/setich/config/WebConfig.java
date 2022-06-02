package com.setich.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${browsers}.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("host")
    String host();
}