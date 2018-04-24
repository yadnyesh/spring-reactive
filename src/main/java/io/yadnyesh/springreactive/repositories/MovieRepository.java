package io.yadnyesh.springreactive.repositories;

import io.yadnyesh.springreactive.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {

}
