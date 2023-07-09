package com.springboot.jian.pojo;
//图书借阅信息对象
public class BorrowingInformation {
    String book;
    String time;
    String user;
    String state;

    public BorrowingInformation() {
    }

    public BorrowingInformation(String book, String time, String user, String state) {
        this.book = book;
        this.time = time;
        this.user = user;
        this.state = state;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "BorrowingInformation{" +
                "book='" + book + '\'' +
                ", time='" + time + '\'' +
                ", user='" + user + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
