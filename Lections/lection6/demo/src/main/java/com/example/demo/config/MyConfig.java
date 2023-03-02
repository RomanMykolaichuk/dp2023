package com.example.demo.config;

import components.Sample;
import components.SampleImpl;
import components.SampleImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Sample getSample(){
        return new SampleImpl();
    }

    @Bean
    public Sample getSample2(){
        return new SampleImpl2();
    }
}
