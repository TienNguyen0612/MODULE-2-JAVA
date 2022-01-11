package baitap.homework;

import java.time.LocalDate;

public class Book {
    private String name;
    private double price;
    private int quantity;
    private LocalDate publicationDate;

    public Book() {
    }

    public Book(String name, double price, int quantity, LocalDate publicationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public double getSumPrice() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
