package com.spring.basic.start.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();
    private final LibraryDbControler libraryDbControler;
}
