package dev.kamva.movies.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reviews")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String body;

    @ManyToOne
    @JsonBackReference  // Prevent infinite recursion during serialization
    private Movie movie;

    public Reviews(String body) {
        this.body = body;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
