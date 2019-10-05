package com.spring.basic.start.library;

import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbControler {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the data base");
    }
}
