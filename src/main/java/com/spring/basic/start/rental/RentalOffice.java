package com.spring.basic.start.rental;

import java.util.ArrayList;
import java.util.List;

public final class RentalOffice {
    private final List<String>rentedItems = new ArrayList<>();
    private final RenatlOfficeDbController renatlOfficeDbController;

    public RentalOffice(final RenatlOfficeDbController renatlOfficeDbController) {
        this.renatlOfficeDbController = renatlOfficeDbController;
    }

    public RentalOffice() {
        // nothing
    }

    public void loadDataFromDb(){

    }

    public void saveDataToDb(){

    }
}
