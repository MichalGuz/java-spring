package com.spring.basic.start.rental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RentalOfficeConfiguration {

    @Bean
    public RentalOffice rentalOfficeConfig(){
        return new RentalOffice(rentalOfficeDbControllerConfig());
    }

    @Bean
    public RentalOfficeDbController rentalOfficeDbControllerConfig() {
        return new RentalOfficeDbController();
    }
}
