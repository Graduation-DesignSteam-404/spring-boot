package com.springboot.jian.controller;

import com.springboot.jian.service.BorrowingMessage;
import com.springboot.jian.service.selectAllBookMessage;
import com.springboot.jian.service.selectAllUserMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class borrowing {
    //    添加借阅信息
    @PostMapping(value = "borrowing")
    public int borrowing(
            @RequestParam String book,
            @RequestParam String user
    ) throws IOException {
        int result = 0;
//        这三个是三大金刚
        BorrowingMessage borrowingMessage = new BorrowingMessage();
        selectAllBookMessage selectAllBookMessage=new selectAllBookMessage();
        selectAllUserMessage selectAllUserMessage=new selectAllUserMessage();

//        判断图书是否存在
        for (int i=0;i<selectAllBookMessage.selectAllBook().size();i++){
            if(selectAllBookMessage.selectAllBook().get(i) ==book){
//                判断用户是否存在
                for (int j=0;j<selectAllUserMessage.selectAllUser().size();j++){
                    if(selectAllUserMessage.selectAllUser().get(j)==user){
                        result = borrowingMessage.Borrowing(book, user);
                    }else {
                        result=-2;
                    }
                }
            }else {
                result=-1;
            }
        }
        return result;
    }

}
