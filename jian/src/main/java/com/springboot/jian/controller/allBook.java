package com.springboot.jian.controller;

import com.springboot.jian.service.allBookMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class allBook {
//    查询所有图书信息
    @GetMapping(value = "allBook")
    public List<Object> allBook() throws IOException {
        allBookMessage allBookMessage =new allBookMessage();
        return allBookMessage.bookMessage();
    }
}
