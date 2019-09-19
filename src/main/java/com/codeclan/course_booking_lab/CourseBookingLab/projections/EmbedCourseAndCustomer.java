package com.codeclan.course_booking_lab.CourseBookingLab.projections;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Booking;
import com.codeclan.course_booking_lab.CourseBookingLab.models.Course;
import com.codeclan.course_booking_lab.CourseBookingLab.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCourseAndCustomer", types = Booking.class)
public interface EmbedCourseAndCustomer {
    public Customer getCustomer();
    public Course getCourse();
}
