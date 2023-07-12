package com.springboot.jian.controller;

import com.springboot.jian.service.appendUserMessage;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class appendUser {

    //    添加用户
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "appendUser")
    public int appendUser(
            @RequestParam String name
    ) throws IOException {
        appendUserMessage appendUserMessage = new appendUserMessage();
        return appendUserMessage.appendUser(name);
    }
}
