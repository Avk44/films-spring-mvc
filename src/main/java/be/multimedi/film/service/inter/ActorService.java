package be.multimedi.film.service.inter;

import be.multimedi.film.model.Actor;
import java.util.List;

public interface ActorService {
    void register(Actor actor);
    void register(List<Actor> actors);
    List<Actor> retrieveAll();
    List<Actor> searchByName(String searchTerm);

}
