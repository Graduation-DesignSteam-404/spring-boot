package com.springboot.jian.pojo;

import java.time.LocalDateTime;

public class User {
    int id;
    String createData;
    String name;

    public User() {
    }

    public User(int id, String createData, String name) {
        this.id = id;
        this.createData = createData;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateData() {
        return createData;
    }

    public void setCreateData(String createData) {
        this.createData = createData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createData='" + createData + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
