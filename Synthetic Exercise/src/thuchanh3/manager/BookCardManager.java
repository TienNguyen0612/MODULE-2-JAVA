package thuchanh3.manager;

import thuchanh3.model.BookCard;
import thuchanh3.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BookCardManager {
    ArrayList<BookCard> bookCards;
    Scanner scanner = new Scanner(System.in);

    public BookCardManager() {
        this.bookCards = new ArrayList<>();
    }

    public BookCard createBookCard(Student student) {
        System.out.println("Nhập vào mã số mượn:");
        String codeOfCard = scanner.nextLine();
        System.out.println("Nhập vào ngày mượn(dd-mm-yyyy):");
        String date1 = scanner.next();
        LocalDate startDate = LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        System.out.println("Nhập vào số ngày mượn:");
        int days = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào số hiệu sách:");
        String codeOfBook = scanner.nextLine();
        BookCard bookCard = new BookCard(codeOfCard, startDate, days, codeOfBook, student);
        bookCards.add(bookCard);
        return bookCard;
    }

    public void displayStudents() {
        HashSet<Student> studentHashSet = new HashSet<>();
        for (BookCard bookCard : bookCards) {
            studentHashSet.add(bookCard.getStudent());
        }
        for (Student student : studentHashSet) {
            System.out.println(student);
        }
    }

    public void displayBookOfStudent(String idStudent) {
        for (BookCard bookCard : bookCards) {
            if (bookCard.getStudent().getIdStudent().equals(idStudent)) {
                System.out.println(bookCard);
            }
        }
    }

    public void endDate(String idStudent) {
        for (BookCard bookCard : bookCards) {
            if (bookCard.getStudent().getIdStudent().equals(idStudent)) {
                System.out.println("Book(code): '" + bookCard.getCodeOfBook() + "', ngày trả: " + bookCard.getStartDate().plusDays(bookCard.getDays()));
            }
        }
    }

    public void displayStudentOutOfDate() {
        BookCard bookCard = null;
        for (BookCard b : bookCards) {
            if(b.getStartDate().plusDays(b.getDays()).isBefore(LocalDate.now())) {
                System.out.println(b.getStudent());
                bookCard = b;
            }
        }
        if (bookCard == null) {
            System.out.println("Không có ai quá hạn trả !");
        }
    }
}
