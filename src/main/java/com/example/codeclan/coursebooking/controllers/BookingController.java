package com.example.codeclan.coursebooking.controllers;

import com.example.codeclan.coursebooking.models.Booking;
import com.example.codeclan.coursebooking.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    // INDEX (GET all Bookings)
    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> allBookings = bookingRepository.findAll();
        return new ResponseEntity<>(allBookings, HttpStatus.OK);
    }

    // SHOW (Get Booking by ID)
}
