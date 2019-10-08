package com.spring.basic.start.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfig {

    @Autowired
    @Qualifier("book1")
    Book book;

    public Reader getReader() {
        return new Reader(book);
    }
}
