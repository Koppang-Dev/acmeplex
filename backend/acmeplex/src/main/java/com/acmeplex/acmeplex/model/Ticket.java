package com.acmeplex.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.util.Date;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;


@Entity
@Table(name = "Ticket") // Use lowercase table name
public class Ticket {

    // Primary Key - ticketId column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketId")
    private int ticketId;

    // Email column
    @Column(name = "email")
    private String email;

    // Price column
    @Column(name = "price")
    private double price;

    // Status column
    @Column(name = "status")
    private String status;

    // Date column
    @Column(name = "purchaseDate")
    private Date purchaseDate;

    // Foreign key movieID
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "movieId", referencedColumnName = "movieId", nullable = false)
    private Movie movie;

    // Foreign key seatId
    @ManyToOne
    @JoinColumn(name = "seatId", referencedColumnName = "seatId", nullable = false)
    private Seat seat;

    // Foreign key showtimeId
    @ManyToOne
    @JoinColumn(name = "showtimeId", referencedColumnName = "showtimeID", nullable = false)
    private Showtime showtime;

    // Default Constructor
    public Ticket() {
    }

     // Parameterized Constructor
     public Ticket(String email, double price, String status, Date purchaseDate, Movie movie, Seat seat, Showtime showtime) {
        this.email = email;
        this.price = price;
        this.status = status;
        this.purchaseDate = purchaseDate;
        this.movie = movie;
        this.seat = seat;
        this.showtime = showtime;
    }

    // Getters and Setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

}
