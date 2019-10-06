package com.spring.basic.start.rental;

import org.springframework.stereotype.Repository;

@Repository
public class RentalOfficeDbController {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the data base");
    }
}
