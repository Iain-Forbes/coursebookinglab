package com.example.codeclan.coursebooking.repositories;

import com.example.codeclan.coursebooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
