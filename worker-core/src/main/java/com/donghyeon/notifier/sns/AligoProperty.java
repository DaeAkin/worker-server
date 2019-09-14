package com.donghyeon.notifier.sns;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Data
@ConfigurationProperties(prefix = "settlement")
@PropertySource(value = {"classpath:/settlement.yml"})
public class AligoProperty {

    private String apiKey;

    private String userId;

    private String sender;
}
