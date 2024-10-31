package com.moviebooking.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.portal.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}