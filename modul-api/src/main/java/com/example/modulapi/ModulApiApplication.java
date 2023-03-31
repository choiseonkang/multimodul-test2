package com.example.modulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.modulcommon", "com.example.modulapi"})
public class ModulApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulApiApplication.class, args);
    }

}
