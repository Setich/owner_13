package com.setich;

import com.setich.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class WebTest {

    @Test
    void localTest() {
        System.setProperty("browsers", "local");
        WebConfig config = ConfigFactory
                .create(WebConfig.class, System.getProperties());

        assertThat(config.browser()).isEqualTo("Chrome");
        assertThat(config.browserVersion()).isEqualTo("98");
        assertThat(config.host()).isEqualTo("http://localhost:4444/wd/hub");
    }

    @Test
    void remoteTest() {
        System.setProperty("browsers", "remote");
        WebConfig config = ConfigFactory
                .create(WebConfig.class, System.getProperties());

        assertThat(config.browser()).isEqualTo("Chrome");
        assertThat(config.browserVersion()).isEqualTo("99");
        assertThat(config.host()).isEqualTo("https://selenoid.cloud/wd/hub/");
    }
}
