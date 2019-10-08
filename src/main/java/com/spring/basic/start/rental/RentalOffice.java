package com.spring.basic.start.rental;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class RentalOffice {
    private final List<String>rentedItems = new ArrayList<>();
    private RentalOfficeDbController rentalOfficeDbController;

    public RentalOffice(final RentalOfficeDbController rentalOfficeDbController) {
        this.rentalOfficeDbController = rentalOfficeDbController;
    }

    public RentalOffice() {
        // nothing
    }

    public void loadDataFromDb(){
    }

    public void saveDataToDb(){
    }
}
