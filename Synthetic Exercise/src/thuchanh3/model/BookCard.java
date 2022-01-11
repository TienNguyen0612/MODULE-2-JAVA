package thuchanh3.model;

import java.time.LocalDate;

public class BookCard {
    private String codeOfCard;
    private LocalDate startDate;
    private int days;
    private String codeOfBook;
    private Student student;

    public BookCard() {
    }

    public BookCard(String codeOfCard, LocalDate startDate, int days, String codeOfBook, Student student) {
        this.codeOfCard = codeOfCard;
        this.startDate = startDate;
        this.days = days;
        this.codeOfBook = codeOfBook;
        this.student = student;
    }

    public String getCodeOfCard() {
        return codeOfCard;
    }

    public void setCodeOfCard(String codeOfCard) {
        this.codeOfCard = codeOfCard;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getCodeOfBook() {
        return codeOfBook;
    }

    public void setCodeOfBook(String codeOfBook) {
        this.codeOfBook = codeOfBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "BookCard{" +
                "codeOfCard='" + codeOfCard + '\'' +
                ", startDate=" + startDate +
                ", days=" + days +
                ", codeOfBook='" + codeOfBook + '\'' +
                ", student=" + student.toString() +
                '}';
    }
}
