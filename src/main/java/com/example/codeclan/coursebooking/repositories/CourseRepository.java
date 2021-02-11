package com.example.codeclan.coursebooking.repositories;

import com.example.codeclan.coursebooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
