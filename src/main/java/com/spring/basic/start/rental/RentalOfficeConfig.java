package com.spring.basic.start.rental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RentalOfficeConfig {
    @Bean
    public RentalOffice rentalOffice() {
        return new RentalOffice(rentalOfficeDbController());
    }

    @Bean
    public RentalOfficeDbController rentalOfficeDbController() {
        return new RentalOfficeDbController();
    }
}
