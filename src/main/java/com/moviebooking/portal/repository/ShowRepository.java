package com.moviebooking.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.portal.model.Show;

public interface ShowRepository extends JpaRepository<Show, Long> {
}