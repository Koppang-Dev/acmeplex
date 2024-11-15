package com.acmeplex.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import java.util.Date;

@Entity
public class Payment {

    /*
     * Primary key of the Payment table
     * The value of id will be automatically generated by the database when a new Payment entity is created
     */
    @Id
    private Long id;

    /*
     * amount column of the Payment table
     * The amount represents the total payment made by the user for a ticket
     */
    @Column(nullable = false)
    private double amount;

    /*
     * paymentMethod column of the Payment table
     * Represents the method used for payment (e.g., "Credit Card", "PayPal")
     */
    @Column(nullable = false, length = 50)
    private String paymentMethod;

    /*
     * date column of the Payment table
     * Represents the date when the payment was made
     */
    @Column(nullable = false)
    private Date date;

    /*
     * Default constructor
     * Hibernate requires a no-arg constructor for JPA entities
     */
    public Payment() {}

    /*
     * Parameterized constructor
     */
    public Payment(double amount, String paymentMethod, Date date) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.date = date;
    }

    /*
     * Method to process the payment
     * Sets the payment as processed (this is just a placeholder for business logic)
     */
    public void processPayment() {
        // Add logic for processing payment (e.g., calling payment gateway API)
        System.out.println("Processing payment of " + amount + " using " + paymentMethod);
    }

    /*
     * Method to refund the payment
     * Sets the payment as refunded (this is just a placeholder for business logic)
     */
    public void refundPayment() {
        // Add logic for refunding the payment (e.g., calling refund API)
        System.out.println("Refunding payment of " + amount + " using " + paymentMethod);
    }

    /*
     * Getters and setters
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /*
     * Override toString() for better object representation
     */
    @Override
    public String toString() {
        return "Payment{id=" + id + ", amount=" + amount + ", paymentMethod='" + paymentMethod + "', date=" + date + "}";
    }
}
