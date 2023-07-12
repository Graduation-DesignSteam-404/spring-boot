package com.springboot.jian.controller;

import com.springboot.jian.service.selectAllUserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class allUserName {
    //    查询所有用户名
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping(value = "allUserName")
    public ArrayList<Object> allUserName() throws IOException {
        selectAllUserMessage selectAllUserMessage = new selectAllUserMessage();
        return (ArrayList<Object>) selectAllUserMessage.selectAllUser();
    }
}
