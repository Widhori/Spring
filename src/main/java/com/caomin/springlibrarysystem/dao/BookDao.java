package com.caomin.springlibrarysystem.dao;

import com.caomin.springlibrarysystem.model.BookInfo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookDao {
    public List<BookInfo> mockBookInfo() {
        List<BookInfo> bookInfos = new ArrayList<>();
        for(int i = 1; i <= 15; i++) {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setId(i);
            bookInfo.setBookName("图书"+i);
            bookInfo.setAuthor("作者"+i);
            bookInfo.setCount(i*15 + 3);
            bookInfo.setPrice(new BigDecimal(new Random().nextInt(100)));
            bookInfo.setPublisher("出版社"+i);
            bookInfo.setState(i%5==0?2:1);
            bookInfos.add(bookInfo);
        }
        return bookInfos;
    }
}
