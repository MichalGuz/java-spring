package com.spring.basic.start.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDbControler libraryDbControler;

    @Autowired
    public Library(final LibraryDbControler libraryDbControler) {
        this.libraryDbControler = libraryDbControler;
    }

    // second constructor without parameters
    public Library() {
        // nothing
    }

    public void saveToDb() {
        libraryDbControler.saveData();
    }

    public void loadFromDb() {
        libraryDbControler.loadData();
    }
}