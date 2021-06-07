package be.multimedi.film.service;

import be.multimedi.film.model.Film;
import be.multimedi.film.repository.FilmRepository;
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

}
