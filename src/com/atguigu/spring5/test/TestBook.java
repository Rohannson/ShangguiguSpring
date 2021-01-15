package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("Java");
//        book.setUserStatus("active");
//        bookService.addBook(book);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("Python");
//        book.setUserStatus("active");
//
//        bookService.updateBook(book);

//        bookService.deleteBook("1");

        int count = bookService.selectCount();
        System.out.println(count);

    }

}
