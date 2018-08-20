package com.example.actuatortransactional;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class MyHealthCheck extends AbstractHealthIndicator {

    private final MyService myService;

    public MyHealthCheck(MyService myService) {
        this.myService = myService;
    }

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        myService.foo();
    }
}
