package com.springboot.jian.service;

import com.springboot.jian.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//添加图书业务
public class appendBookMessage {
    public int appendBook(String name, String author) throws IOException {
        //传入参数(书名和作者)
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);

        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 加载 MyBatis 配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.insert("InsertBook", book);
        // 提交业务
        sqlSession.commit();
        // 返回成功/失败的结果
        return count;
    }
}
