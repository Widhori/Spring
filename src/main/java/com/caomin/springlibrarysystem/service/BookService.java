package com.caomin.springlibrarysystem.service;

import com.caomin.springlibrarysystem.dao.BookDao;
import com.caomin.springlibrarysystem.model.BookInfo;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class BookService {
    /**
     * 根据数据层返回的结果，对数据进行处理
     * @return
     */
    public List<BookInfo> getBookInfoList() {
        BookDao bookDao = new BookDao();
        List<BookInfo> bookInfos = bookDao.mockBookInfo();
        for (BookInfo bookInfo : bookInfos) {
            if (bookInfo.getState() == 1) {
                bookInfo.setStateCN("可借阅");
            } else if (bookInfo.getState() == 2) {
                bookInfo.setStateCN("不可借阅");
            }
        }
        return bookInfos;
    }
}
