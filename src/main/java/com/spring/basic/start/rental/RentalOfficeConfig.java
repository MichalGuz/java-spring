package com.spring.basic.start.rental;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RentalOfficeConfig {
    public RentalOffice rentalOffice() {
        return new RentalOffice(rentalOfficeDbController());
    }

    public RentalOfficeDbController rentalOfficeDbController() {
        return new RentalOfficeDbController();
    }
}
