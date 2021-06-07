package be.multimedi.film.controller;

import be.multimedi.film.model.Actor;
import be.multimedi.film.service.inter.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ActorController {
    private final ActorService actorService;

    @GetMapping("/actors")
    public String fetchAllFilms(Model model){
        List<Actor> allMyActors = actorService.retrieveAll();
        model.addAttribute("actors", allMyActors);
        return "actorList";
    }

}
