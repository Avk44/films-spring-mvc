package be.multimedi.film.service.impl;

import be.multimedi.film.model.Film;
import be.multimedi.film.repository.FilmRepository;
import be.multimedi.film.service.inter.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepository;


    @Override
    public void register(Film film) {
        filmRepository.save(film);
    }

    @Override
    public Film retrieveById(Long id) {
        return filmRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Film> retrieveAll() {
        return filmRepository.findAll();
    }

    @Override
    public List<Film> getAllFilmsByTitle(String searchTerm) {
        return filmRepository.findFilmsByTitleIsLike("%" + searchTerm + "%");
    }

}
