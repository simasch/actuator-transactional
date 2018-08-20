package com.example.actuatortransactional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class Config {

    @Bean("transactionManager")
    public PlatformTransactionManager transactionManager() {
        return new MyTransactionManager();
    }
}
