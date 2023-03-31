package com.example.modulapi.controller;

import com.example.modulcommon.service.CommonDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final CommonDemoService commonDemoService;

    public DemoController(CommonDemoService commonDemoService) {
        this.commonDemoService = commonDemoService;
    }

    @GetMapping("/test")
    public String test() {
        System.out.println(commonDemoService.commonService());
        return "test 입니다ekekek";
    }
}
