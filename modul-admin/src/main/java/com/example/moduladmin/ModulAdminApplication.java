package com.example.moduladmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.moduladmin", "com.example.modulcommon"})
public class ModulAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulAdminApplication.class, args);
    }

}
