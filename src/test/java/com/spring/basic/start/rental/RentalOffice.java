package com.spring.basic.start.rental;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalOffice {
    private final List<String> books = new ArrayList<>();
    private RentalOfficeDbController rentalOfficeDbController;

}