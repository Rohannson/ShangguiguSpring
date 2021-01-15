package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //     书本添加方法
    @Override
    public void addBook(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getUserId(),book.getUserName(),book.getUserStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username = ?, ustatus = ? where user_id = ?";
        Object[] args = {book.getUserName(), book.getUserStatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where user_id = ?";
        Object[] args = {id};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        int update = jdbcTemplate.queryForObject(sql, Integer.class);
        return update;
    }

}
