package com.springboot.jian.controller;

import com.springboot.jian.service.appendBookMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class appendBook {
//    添加图书
    @PostMapping(value = "appendBook")
    public int appendBook(
            @RequestParam String name,
            @RequestParam String author
    ) throws IOException {
        appendBookMessage appendBookMessage=new appendBookMessage();
        return appendBookMessage.appendBook(name,author);
    }
}
