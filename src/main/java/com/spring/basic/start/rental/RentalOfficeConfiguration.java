package com.spring.basic.start.rental;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RentalOfficeConfiguration {
    public RentalOfficeDbController rentalOfficeDbControllerConfig() {
        return new RentalOfficeDbController();
    }
}
