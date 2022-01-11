package baitap.homework;

import java.time.LocalDate;

public class ScienceBook extends Book {
    private String type;

    public ScienceBook() {
    }

    public ScienceBook(String type) {
        this.type = type;
    }

    public ScienceBook(String name, double price, int quantity, LocalDate publicationDate, String type) {
        super(name, price, quantity, publicationDate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", publicationDate=" + getPublicationDate() +
                ", type='" + type + '\'' +
                '}';
    }
}
