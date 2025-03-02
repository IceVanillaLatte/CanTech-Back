package com.cantech.backend.backend_service.test;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/back/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public List<TestEntity> getAllTests() {
        return testService.getAllTests();
    }
}