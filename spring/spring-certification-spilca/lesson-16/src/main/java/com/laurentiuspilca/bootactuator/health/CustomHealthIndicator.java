package com.laurentiuspilca.bootactuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        return Health.up().withDetail("myHealthKey", "Very Healthy").build();
    }

    @Override
    public Health health() {
        return null;
    }
}
