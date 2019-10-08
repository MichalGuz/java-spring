package com.spring.basic.start.rental;

import org.springframework.stereotype.Service;

@Service
public final class RenatlOfficeDbController {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Load data from the database.");
    }
}
