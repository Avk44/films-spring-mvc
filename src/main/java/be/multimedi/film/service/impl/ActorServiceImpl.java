package be.multimedi.film.service.impl;

import be.multimedi.film.model.Actor;
import be.multimedi.film.repository.ActorRepository;
import be.multimedi.film.service.inter.ActorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;

    @Override
    public void register(Actor actor) {
        actorRepository.save(actor);
    }

    @Override
    public void register(List<Actor> actors) {
        for (Actor actor : actors) {
            register(actor);
        }
    }

    @Override
    public List<Actor> retrieveAll() {
        return actorRepository.findAll();
    }

    @Override
    public List<Actor> searchByName(String searchTerm) {
        return actorRepository.findActorsByNameIsLike("%" + searchTerm + "%");
    }

}
