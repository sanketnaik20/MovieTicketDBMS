package com.moviebooking.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.moviebooking.portal.repository.MovieRepository;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public String listMovies(Model model) {
        model.addAttribute("movies", movieRepository.findAll());
        return "movies/list";
    }

    @GetMapping("/{id}")
    public String showMovie(@PathVariable Long id, Model model) {
        model.addAttribute("movie", movieRepository.findById(id).orElse(null));
        return "movies/detail";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Connected successfully: " + movieRepository.count() + " movies found.";
    }
}
