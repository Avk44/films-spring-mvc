package be.multimedi.film.repository;

import be.multimedi.film.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findActorsByNameIsLike(String s);
}
