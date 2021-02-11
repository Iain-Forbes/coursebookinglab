package com.example.codeclan.coursebooking.repositories;

import com.example.codeclan.coursebooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // MVP
    // Get all customers for a given course
}
