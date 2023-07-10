package com.springboot.jian.controller;

import com.springboot.jian.service.appendUserMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class appendUser {
    //    添加用户
    @PostMapping(value = "appendUser")
    public int appendUser(
            @RequestParam String name
    ) throws IOException {
        appendUserMessage appendUserMessage = new appendUserMessage();
        return appendUserMessage.appendUser(name);
    }
}
