package be.multimedi.film.repository;

import be.multimedi.film.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findFilmsByTitleIsLike(String title);
}
