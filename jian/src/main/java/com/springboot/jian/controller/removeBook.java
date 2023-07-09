package com.springboot.jian.controller;

import com.springboot.jian.service.removeBookMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class removeBook {
//    删除图书
    @GetMapping(value = "removeBook")
    public int removeBook(
            @RequestParam String name
    ) throws IOException {
        removeBookMessage removeBookMessage=new removeBookMessage();
        return removeBookMessage.removeBook(name);
    }
}
