package com.example.demo;

import components.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    @Qualifier("getSample")
    Sample sample;

    //
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner someClR() {

        return (args) -> {
            System.out.println("someCLR");
            System.out.println(sample.message());
        };

    }

    @Bean
    public CommandLineRunner someClR2(@Qualifier("getSample2") Sample sample) {

        return (args) -> {
            System.out.println("someCLR2");
            System.out.println(sample.message());
        };

    }

}
