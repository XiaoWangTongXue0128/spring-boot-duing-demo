package com.duing.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator {
    @Override
    public Health health() {
        int errorcode = 1;
        if (errorcode != 0) {
            //        返回不健康指标，并返回具体code值
            return Health.down().withDetail("ErrorCode " , errorcode).build();
        }
//        返回健康指标
        return Health.up().build();
    }
}
