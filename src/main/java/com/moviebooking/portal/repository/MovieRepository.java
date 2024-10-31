package com.moviebooking.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.portal.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}