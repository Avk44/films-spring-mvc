package be.multimedi.film.model;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "photo_url")
    private String photoUrl;
    @ManyToMany(mappedBy = "cast", fetch = FetchType.EAGER)
    private Set<Film> films = new HashSet<>();

    public void addFilm(Film film){
        films.add(film);
        if(!film.getCast().contains(this)) {
            film.addActor(this);
        }
    }

}
