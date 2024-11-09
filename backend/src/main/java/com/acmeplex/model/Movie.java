package com.acmeplex.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Date;

@Entity
public class Movie {

    /*
     * Primary key of the Movie table
     * The value of id will be automatically generated by the database when a new Movie entity is created
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * title column of the Movie table
     * The title cannot be NULL
     * The length is limited to 200 characters
     */
    @Column(nullable = false, length = 200)
    private String title;

    /*
     * director column of the Movie table
     * The director cannot be NULL
     * The length is limited to 100 characters
     */
    @Column(nullable = false, length = 100)
    private String director;

    /*
     * releaseDate column of the Movie table
     * The release date cannot be NULL
     */
    @Column(nullable = false)
    private Date releaseDate;

    /*
     * genre column of the Movie table
     * The genre can be NULL
     * The length is limited to 50 characters
     */
    @Column(length = 50)
    private String genre;

    /*
     * rating column of the Movie table
     * The rating cannot be NULL
     */
    @Column(nullable = false)
    private double rating;

    /*
     * Default constructor
     * Hibernate requires a no-arg constructor for JPA entities
     */
    public Movie() {}

    /*
     * Parameterized constructor
     */
    public Movie(String title, String director, Date releaseDate, String genre, double rating) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.rating = rating;
    }

    /*
     * Gets the ID value of the movie
     */
    public Long getId() {
        return id;
    }

    /*
     * Sets the ID value of the movie
     */
    public void setId(long id) {
        this.id = id;
    }

    /*
     * Gets the title of the movie
     */
    public String getTitle() {
        return title;
    }

    /*
     * Sets the title of the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /*
     * Gets the director of the movie
     */
    public String getDirector() {
        return director;
    }

    /*
     * Sets the director of the movie
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /*
     * Gets the release date of the movie
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /*
     * Gets the genre of the movie
     */
    public String getGenre() {
        return genre;
    }

    /*
     * Sets the genre of the movie
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /*
     * Gets the rating of the movie
     */
    public double getRating() {
        return rating;
    }

    /*
     * Override toString for better object representation
     */
    @Override
    public String toString() {
        return "Movie{id=" + id + ", title='" + title + "', director='" + director + "', releaseDate=" + releaseDate
                + ", genre='" + genre + "', rating=" + rating + "}";
    }
}