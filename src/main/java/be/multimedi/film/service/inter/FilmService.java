package be.multimedi.film.service.inter;


import be.multimedi.film.model.Film;
import java.util.List;

public interface FilmService {
    void register(Film film);
    Film retrieveById(Long id);
    List<Film> retrieveAll();

}
