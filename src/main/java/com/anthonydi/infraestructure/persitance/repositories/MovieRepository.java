package com.anthonydi.infraestructure.persitance.repositories;

import com.anthonydi.application.acl.MovieDTO;
import io.vavr.collection.List;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

    public List<MovieDTO> findMovies() {
        return List.of( new MovieDTO( "movie 1" , "1990", "horror" ),
                new MovieDTO( "movie 2" , "2000", "action" ),
                new MovieDTO( "movie 3" , "2000", "horror" ) );
    }

}
