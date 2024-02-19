package com.example.springboot.config;

import com.example.springboot.service.DevProfile;
import com.example.springboot.service.ProductionProfile;
import com.example.springboot.service.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile DevProfile(){
        return new DevProfile();
    }
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public SystemProfile ProductionProfile(){
        return new ProductionProfile();
    }
}
