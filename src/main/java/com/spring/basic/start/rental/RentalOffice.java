package com.spring.basic.start.rental;

import java.util.ArrayList;
import java.util.List;

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
