package com.codeclan.course_booking_lab.CourseBookingLab.controllers;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Customer;
import com.codeclan.course_booking_lab.CourseBookingLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer>findCustomersByCourseId(@PathVariable Long id){
        return customerRepository.findByCourse(id);
    }
}
