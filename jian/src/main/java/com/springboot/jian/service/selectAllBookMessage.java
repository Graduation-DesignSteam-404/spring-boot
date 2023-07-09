package com.springboot.jian.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
//查询所有图书书名
public class selectAllBookMessage {
    public List<Object> selectAllBook() throws IOException {
        // 用于接收数据
        List<Object> arrayList = new ArrayList<>();
        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 加载 MyBatis 配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行查询操作
        arrayList= sqlSession.selectList("SelectBookName");
        return arrayList;
    }

    public static void main(String[] args) throws IOException {
        selectAllBookMessage selectAllBookMessage = new selectAllBookMessage();
        System.out.println(selectAllBookMessage.selectAllBook());
    }
}
