package com.caomin.springlibrarysystem.controller;

import com.caomin.springlibrarysystem.dao.BookDao;
import com.caomin.springlibrarysystem.model.BookInfo;
import com.caomin.springlibrarysystem.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/book")
public class bookController {
    @RequestMapping("/getList")
    public List<BookInfo> getLit() {
        BookService bookService = new  BookService();
        List<BookInfo> bookInfos = bookService.getBookInfoList();
        return bookInfos;
    }

}
