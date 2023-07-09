package com.springboot.jian.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

//修改用户信息
public class fixupUserMessage {
    public int fixUpUser(String newName,String oldName) throws IOException {
        Map<String, String> user = new HashMap<>();
        user.put("newName", newName);
        user.put("oldName", oldName);

        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 加载 MyBatis 配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int count = sqlSession.update("UpdateUser",user);
        // 提交业务
        sqlSession.commit();
        // 返回成功/失败的结果
        return count;
    }
}
