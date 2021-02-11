package com.example.codeclan.coursebooking.controllers;

import com.example.codeclan.coursebooking.models.Booking;
import com.example.codeclan.coursebooking.models.Customer;
import com.example.codeclan.coursebooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    // INDEX (GET all Customers)
    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> allCustomers = customerRepository.findAll();
        return new ResponseEntity<>(allCustomers, HttpStatus.OK);
    }

    // SHOW (Get Customer by ID)
    @GetMapping(value = "/customers/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
