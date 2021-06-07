package be.multimedi.film.bootstrap;


import be.multimedi.film.model.Actor;
import be.multimedi.film.model.Film;
import be.multimedi.film.service.inter.ActorService;
import be.multimedi.film.service.inter.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Component
@AllArgsConstructor
public class Bootstrap {
    private final FilmService filmService;
    private final ActorService actorService;

//    @PostConstruct
//    public void init(){
//        // Actors
//        Actor willSmith = Actor.builder().name("Will Smith").photoUrl("https://m.media-amazon.com/images" +
//                "/M/MV5BNTczMzk1MjU1MV5BMl5BanBnXkFtZTcwNDk2MzAyMg@@._V1_UY317_CR2,0,214,317_AL_.jpg")
//                .films(new HashSet<>()).build();
//        Actor juliaRoberts = Actor.builder().name("Julia Roberts").photoUrl("https://cdn.pijper.io/source/grazia/grazia" +
//                "/2019/04/julia_roberts.jpg")
//                .films(new HashSet<>()).build();
//        Actor bradPitt = Actor.builder().name("Brad Pitt").photoUrl("https://img.hbvl.be/wcmPNV8khIpidsSwos7Xxg7_wOM=/960x640/smart/https%3A%2F%2Fstatic." +
//                "hbvl.be%2FAssets%2FImages_Upload%2F2020%2F07%2F31%2F22269f8e-d315-11ea-a210-3382e2abf7bc.jpg")
//                .films(new HashSet<>()).build();
//
//        List<Actor> actors = new ArrayList<Actor>(Arrays.asList(
//                willSmith,juliaRoberts,bradPitt
//        ));
//      actorService.register(actors);
//
//
//        // Make film object(s)
//
//       Film legend = Film.builder()
//               .title("I am Legend")
//               .releaseDate(LocalDate.of(2007,Month.JANUARY,22))
//               .posterUrl("https://media.s-bol.com/BnwprNK97W52/550x784.jpg")
//               .cast(new HashSet<>()).build();
//       legend.addActor(willSmith);
//
//       filmService.register(legend);
//
//       Film mexican = Film.builder()
//               .title("The Mexican")
//               .releaseDate(LocalDate.of(2001,Month.APRIL,15))
//               .posterUrl("https://images-na.ssl-images-amazon.com/images/I/91C1ETcOrIL._SX342_.jpg")
//               .cast(new HashSet<>())
//               .build();
//       mexican.addActor(juliaRoberts);
//       mexican.addActor(bradPitt);
//       filmService.register(mexican);
//
//
//    }

}
