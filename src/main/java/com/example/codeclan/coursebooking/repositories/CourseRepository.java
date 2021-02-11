package com.example.codeclan.coursebooking.repositories;

import com.example.codeclan.coursebooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // MVP
    // Get all courses with a given rating

    // Get all courses for a given customer

}
