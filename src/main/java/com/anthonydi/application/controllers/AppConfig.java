package com.anthonydi.application.controllers;

import com.anthonydi.application.services.MovieService;
import com.anthonydi.infraestructure.persitance.repositories.MovieRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean()
    public MovieService movieService( MovieRepository movieRepository ) {
        return new MovieService( movieRepository );
    }
}
