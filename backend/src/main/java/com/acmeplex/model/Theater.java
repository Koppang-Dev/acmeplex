package com.acmeplex.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Date;

@Entity
public class Theater {

    /*
     * Primary key of the Theater table
     * The value of id will be automatically generated by the database when a new Theater entity is created
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
     * name column of the Theater table
     * The name cannot be NULL
     * The length is limited to 100 characters
     */
    @Column(nullable = false, length = 100)
    private String name;

    /*
     * location column of the Theater table
     * The location cannot be NULL
     * The length is limited to 200 characters
     */
    @Column(nullable = false, length = 200)
    private String location;

    /*
     * capacity column of the Theater table
     * The capacity cannot be NULL
     */
    @Column(nullable = false)
    private int capacity;

    /*
     * openingDate column of the Theater table
     * The opening date cannot be NULL
     */
    @Column(nullable = false)
    private Date openingDate;

    /*
     * Default constructor
     * Hibernate requires a no-arg constructor for JPA entities
     */
    public Theater() {}

    /*
     * Parameterized constructor
     */
    public Theater(String name, String location, int capacity, Date openingDate) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.openingDate = openingDate;
    }

    /*
     * Gets the ID value of the theater
     */
    public Long getId() {
        return id;
    }

    /*
     * Gets the name of the theater
     */
    public String getName() {
        return name;
    }

     /*
     * Sets the name of the theater
     */
    public void setName(String name) {
        this.name = name;
    }

    

    /*
     * Gets the location of the theater
     */
    public String getLocation() {
        return location;
    }

    /*
     * Gets the capacity of the theater
     */
    public int getCapacity() {
        return capacity;
    }

    /*
     * Gets the opening date of the theater
     */
    public Date getOpeningDate() {
        return openingDate;
    }

    /*
     * Override toString for better object representation
     */
    @Override
    public String toString() {
        return "Theater{id=" + id + ", name='" + name + "', location='" + location + "', capacity=" + capacity + ", openingDate=" + openingDate + "}";
    }
}
