package baitap.homework;

import java.time.LocalDate;

public class NovelBook extends Book {
    private String author;

    public NovelBook() {
    }

    public NovelBook(String author) {
        this.author = author;
    }

    public NovelBook(String name, double price, int quantity, LocalDate publicationDate, String author) {
        super(name, price, quantity, publicationDate);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", publicationDate=" + getPublicationDate() +
                ", author='" + author + '\'' +
                '}';
    }
}
