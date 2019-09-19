package com.codeclan.course_booking_lab.CourseBookingLab.repositories.BookingRepository;

import com.codeclan.course_booking_lab.CourseBookingLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);
}
