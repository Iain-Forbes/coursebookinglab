package com.example.codeclan.coursebooking.components;

import com.example.codeclan.coursebooking.models.Booking;
import com.example.codeclan.coursebooking.models.Course;
import com.example.codeclan.coursebooking.models.Customer;
import com.example.codeclan.coursebooking.repositories.BookingRepository;
import com.example.codeclan.coursebooking.repositories.CourseRepository;
import com.example.codeclan.coursebooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course course = new Course("Intro to Python", "Glasgow", 3);
        courseRepository.save(course);

        Customer customer = new Customer("Ailsa", "Edinburgh", 27);
        customerRepository.save(customer);

        Booking booking = new Booking("11-02-21", course, customer);
        bookingRepository.save(booking);

        customer.addBooking(booking);
        customerRepository.save(customer);

        course.addBooking(booking);
        courseRepository.save(course);
    }
}
