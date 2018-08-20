package com.example.actuatortransactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MyService {

    private final static Logger LOGGER = LoggerFactory.getLogger(MyService.class);

    @Transactional
    public void foo() {
        LOGGER.info("foo");
    }
}
