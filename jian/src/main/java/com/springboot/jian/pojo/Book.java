package com.springboot.jian.pojo;

public class Book {
    int id;
    String name;
    String author;
    String user;

    public Book() {
    }

    public Book(int id, String name, String author, String user) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
