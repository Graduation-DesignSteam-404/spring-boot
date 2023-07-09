package com.springboot.jian.service;

import com.springboot.jian.pojo.BorrowingInformation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class returnBookMessage {
    public int returnBook(String bookName, String userName) throws IOException {
        BorrowingInformation borrowingInformation=new BorrowingInformation();
        borrowingInformation.setBook(bookName);
        borrowingInformation.setUser(userName);

        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 加载 MyBatis 配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.insert("InsertReturn",borrowingInformation);
        // 提交业务
        sqlSession.commit();
        // 返回成功/失败的结果
        return count;
    }
}
