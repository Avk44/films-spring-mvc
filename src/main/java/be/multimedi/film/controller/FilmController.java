package be.multimedi.film.controller;

import be.multimedi.film.model.Film;
import be.multimedi.film.service.inter.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/film/{id}")
    public String fetchFilmDetailed(Model model,@PathVariable Long id){
        Film fetchedFilm = filmService.retrieveById(id);
        model.addAttribute("film",fetchedFilm);
        return "filmDetail";
    }

    @GetMapping(value = "/films", params = "title")
    public String fetchAllFilmsByTitle(Model model,@RequestParam(name = "title") String searchTerm){
        List<Film> searchedFilms = filmService.getAllFilmsByTitle(searchTerm);
        model.addAttribute("films",searchedFilms);
        return "filmList";
    }


    @GetMapping("/film/new")
    public String showAddFilmForm(Model model){
        model.addAttribute("film",new Film());
        return "newFilmForm";
    }

    @PostMapping("/film/new")
    public String addNewFilm(Film film){
        filmService.register(film);
        return "filmList";
    }

    @GetMapping("/film/{id}/edit")
    public String showEditFilmForm(Model model, @PathVariable Long id){
        Film film = filmService.retrieveById(id);
        model.addAttribute("film", film);
        return "editFilmForm";
    }

    @PostMapping("/film/{id}/edit")
    public String editFilm(Film film){
        filmService.register(film);
        return "filmList";
    }

    @DeleteMapping("/film/{id}/delete")
    public String deleteFilm(@PathVariable Long id){
        filmService.deleteFilmById(id);
        return "filmList";
    }



}
