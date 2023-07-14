package com.springboot.jian.controller;

import com.springboot.jian.service.BorrowingMessage;
import com.springboot.jian.service.selectAllBookMessage;
import com.springboot.jian.service.selectAllUserMessage;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class borrowing {
    //    添加借阅信息
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "borrowing")
    public int borrowing(
            @RequestParam String book,
            @RequestParam String user
    ) throws IOException {
        boolean bookMessage = false;
        boolean userMessage = false;
        int result = 0;
//        这三个是三大金刚
        BorrowingMessage borrowingMessage = new BorrowingMessage();
        selectAllUserMessage selectAllUserMessage = new selectAllUserMessage();

//        判断图书是否存在
        for (int i = 0; i < com.springboot.jian.service.selectAllBookMessage.selectAllBook().size(); i++) {
            if (com.springboot.jian.service.selectAllBookMessage.selectAllBook().get(i).equals(book)) {
                bookMessage=true;
                break;
            }
        }
//        判断用户是否存在
        for (int j = 0; j < selectAllUserMessage.selectAllUser().size(); j++) {
            if (selectAllUserMessage.selectAllUser().get(j).equals(user)) {
                borrowingMessage.Borrowing(book, user);
                userMessage=true;
                break;
            }
        }
        if(!bookMessage){
            result=-1;
        }
        if(!userMessage){
            result=-2;
        }
        if(bookMessage && userMessage){
            result=1;
        }
        return result;
    }

}
