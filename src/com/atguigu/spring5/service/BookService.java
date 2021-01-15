package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;


//    书本添加方法
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

//    更新書本的方法
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

//    刪除書本的方法
    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

//    查询某个值
    public int selectCount() {
        return bookDao.selectCount();
    }
}
