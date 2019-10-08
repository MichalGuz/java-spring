package com.spring.basic.start.rental;

import org.springframework.stereotype.Repository;

@Repository
public final class RentalOfficeDbController {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Load data from the database.");
    }
}
