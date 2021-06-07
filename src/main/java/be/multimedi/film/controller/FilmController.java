package be.multimedi.film.controller;

import be.multimedi.film.model.Film;
import be.multimedi.film.service.inter.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
@AllArgsConstructor
public class FilmController {
    private final FilmService filmService;

    @GetMapping("/films")
    public String fetchAllFilms(Model model){
        List<Film> allMyFilms = filmService.retrieveAll();
        model.addAttribute("films", allMyFilms);
        return "filmList";
    }

}
