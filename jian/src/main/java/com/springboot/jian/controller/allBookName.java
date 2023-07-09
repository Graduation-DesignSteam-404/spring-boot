package com.springboot.jian.controller;

import com.springboot.jian.service.selectAllBookMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class allBookName {
//    查询所有书名
    @GetMapping(value = "allBookName")
    public ArrayList<Object> allBookName() throws IOException {
        selectAllBookMessage selectAllBookMessage=new selectAllBookMessage();
        return (ArrayList<Object>) selectAllBookMessage.selectAllBook();
    }
}
