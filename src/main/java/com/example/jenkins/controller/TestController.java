package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangnenghe
 * @date 2023-02-28 20:18
 */
@RestController
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("你好世界");
        return "hello world!";
    }
}
