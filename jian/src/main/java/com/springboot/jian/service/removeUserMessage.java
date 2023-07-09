package com.springboot.jian.service;
//删除用户

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class removeUserMessage {
    public int removeUser(String name) throws IOException {
        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 加载 MyBatis 配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.insert("DeleteUser", name);
        // 提交业务
        sqlSession.commit();
        // 返回成功/失败的结果
        return count;
    }
}
