package com.anthonydi.application.services;

import com.anthonydi.application.acl.MovieDTO;
import com.anthonydi.infraestructure.persitance.repositories.MovieRepository;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService( MovieRepository movieRepository ) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDTO> findMovies() {
        return movieRepository.findMovies();
    }
}
