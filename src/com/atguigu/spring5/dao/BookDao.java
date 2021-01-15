package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;

public interface BookDao {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void deleteBook(String id);

    public int selectCount();
}
