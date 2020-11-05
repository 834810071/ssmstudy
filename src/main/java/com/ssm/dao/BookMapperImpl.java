package com.ssm.dao;

import com.ssm.pojo.Books;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class BookMapperImpl implements BookMapper {

    SqlSessionTemplate sessionTemplate;

    public int addBook(Books books) {
        return 0;
    }

    public int deleteBookById(int id) {
        return 0;
    }

    public int updateBook(Books books) {
        return 0;
    }

    public Books queryBookById(int id) {
        return null;
    }

    public List<Books> queryAllBook() {
        return null;
    }

    public Books queryBookByName(String bookName) {
        return null;
    }
}
