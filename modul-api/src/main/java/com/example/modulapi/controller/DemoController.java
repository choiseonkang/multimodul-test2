package com.example.modulapi.controller;

import com.example.modulcommon.service.CommonDemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${spring.config.activate.on-profile}")
    private String profile;
    
    private final CommonDemoService commonDemoService;

    public DemoController(CommonDemoService commonDemoService) {
        this.commonDemoService = commonDemoService;
    }

    @GetMapping("/test")
    public String test() {
        System.out.println(commonDemoService.commonService());
        return commonDemoService.commonService();
    }
    
    @GetMapping("/profile")
    public String getProfile() {
        return profile;
    }
}
