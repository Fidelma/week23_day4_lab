package com.codeclan.course_booking_lab.CourseBookingLab.components;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Booking;
import com.codeclan.course_booking_lab.CourseBookingLab.models.Course;
import com.codeclan.course_booking_lab.CourseBookingLab.models.Customer;
import com.codeclan.course_booking_lab.CourseBookingLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.course_booking_lab.CourseBookingLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.course_booking_lab.CourseBookingLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    public void run(ApplicationArguments args){

        Customer customer1 = new Customer("Bob", "Edinburgh", 25);
        Customer customer2 = new Customer("Bobbet", "Glasgow", 25);
        Customer customer3 = new Customer("Roberta", "Edinburgh", 25);

        Course python = new Course("Intro Python", "Edinburgh", 5);
        Course java = new Course("Intro Java", "Edinburgh", 2);
        Course javascript = new Course("Intro js", "Glasgow", 4);

        Booking booking1 = new Booking("10-09-19", customer1, python);
        Booking booking2 = new Booking("29-10-19", customer2, java);
        Booking booking3 = new Booking("13-11-20", customer3, javascript);
        Booking booking4 = new Booking("13-11-20", customer2, javascript);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        courseRepository.save(python);
        courseRepository.save(java);
        courseRepository.save(javascript);

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);


    }


}
