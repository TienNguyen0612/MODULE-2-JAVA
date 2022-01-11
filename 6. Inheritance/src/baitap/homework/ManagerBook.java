package baitap.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class ManagerBook {
    public static void main(String[] args) {
        //Tạo mảng n quyển sách
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số loại sách muốn tạo: ");
        int size = scanner.nextInt();
        Book[] books = new Book[size];
        double sumScienceBookPrice = 0;
        int count = 0;
        int choice;

        //Nhập thông tin sách
        for (int i = 0; i < books.length; i++) {
            System.out.println("1. Nhập sách Bình thường");
            System.out.println("2. Nhập sách Khoa học");
            System.out.println("3. Nhập sách Tiểu thuyết");
            System.out.println("Enter your choice:");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Nhập loại sách thứ " + (i + 1) + ": ");
                Book book1 = createBook(scanner);
                books[i] = book1;
            } else if (input == 2) {
                System.out.println("Nhập loại sách thứ " + (i + 1) + ": ");
                Book book2 = createScienceBook(scanner);
                books[i] = book2;
                sumScienceBookPrice += book2.getPrice();
                count++;
            } else if (input == 3) {
                System.out.println("Nhập loại sách thứ " + (i + 1) + ": ");
                Book book3 = createNovelBook(scanner);
                books[i] = book3;
            } else {
                System.out.println("Wrong!!!");
            }
        }

        //Hiển thị tất cả các quyển sách
        displayListBook(books);

        do {
            System.out.println("Menu:");
            System.out.println("----------------------------------------------");
            System.out.println("| 1. Hiển thị tất cả các loại sách           |");
            System.out.println("| 2. Tính tổng giá tiền tất cả các loại sách |");
            System.out.println("| 3. Tìm quyển sách có giá cao nhất          |");
            System.out.println("| 4. Tìm quyển sách có giá thấp nhất         |");
            System.out.println("| 5. Tìm sách                                |");
            System.out.println("| 6. Tính đơn giá trung bình sách Khoa học   |");
            System.out.println("| 0. Exit                                    |");
            System.out.println("----------------------------------------------");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            if (choice < 0 || choice > 6) {
                System.out.println("Lựa chọn không có trong Menu, mời nhập lại!!!");
            }
            switch (choice) {
                case 1:
                    displayListBook(books);
                    break;
                case 2:
                    sumPriceInArray(books);
                    break;
                case 3:
                    getMaxPriceBook(books);
                    break;
                case 4:
                    getMinPriceBook(books);
                    break;
                case 5:
                    menuFindBook(scanner, books);
                    break;
                case 6:
                    averagePriceScienceBook(sumScienceBookPrice, count);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    //Hiển thị danh sách
    private static void displayListBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    //Menu Tìm sách
    private static void menuFindBook(Scanner scanner, Book[] books) {
        int choice1;
        do {
            System.out.println("----------------------------");
            System.out.println("1. Tìm theo thể loại");
            System.out.println("2. Tìm theo tên tác giả");
            System.out.println("3. Tìm theo khoảng giá");
            System.out.println("4. Hiển thị sách Khoa học");
            System.out.println("5. Hiển thị sách Tiểu thuyết");
            System.out.println("0. Exit");
            System.out.println("----------------------------");
            System.out.println("Enter your choice:");
            choice1 = scanner.nextInt();
            if (choice1 < 0 || choice1 > 5) {
                System.out.println("Xin mời nhập lại");
            }
            switch (choice1) {
                case 1:
                    findTypeBook(scanner, books);
                    break;
                case 2:
                    findAuthorBook(scanner, books);
                    break;
                case 3:
                    findPriceBook(scanner, books);
                    break;
                case 4:
                    displayScienceBook(books);
                    break;
                case 5:
                    displayNovelBook(books);
                    break;
            }
        } while (choice1 != 0);
    }

    //Hiển thị sách Tiểu thuyết
    private static void displayNovelBook(Book[] books) {
        int check = 0;
        for (Book book : books) {
            if (book instanceof NovelBook) {
                System.out.println(book);
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Không có sách Tiểu thuyết !!!");
        }
    }

    //Hiển thị sách Khoa học
    private static void displayScienceBook(Book[] books) {
        int check = 0;
        for (Book book : books) {
            if (book instanceof ScienceBook) {
                System.out.println(book);
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Không có sách Khoa học !!!");
        }
    }

    //Tìm sách theo khoảng giá
    private static void findPriceBook(Scanner scanner, Book[] books) {
        int check = 0;
        scanner.nextLine();
        System.out.println("Bạn muốn tìm sách có giá từ:");
        double price1 = scanner.nextDouble();
        System.out.println("đến:");
        double price2 = scanner.nextDouble();
        if (price1 <= price2) {
            for (Book book : books) {
                if (book.getPrice() >= price1 && book.getPrice() <= price2) {
                    System.out.println(book);
                    check++;
                }
            }
            if (check == 0) {
                System.out.println("Không tìm thấy !!!");
            }
        } else {
            System.out.println("Nhập sai rồi !");
        }
    }

    //Tìm sách theo tên tác giả
    private static void findAuthorBook(Scanner scanner, Book[] books) {
        int check = 0;
        scanner.nextLine();
        System.out.println("Nhập tên tác giả:");
        String name = scanner.nextLine();
        for (Book book : books) {
            if (book instanceof NovelBook) {
                if (((NovelBook) book).getAuthor().equals(name)) {
                    System.out.println(book);
                    check++;
                }
            }
        }
        if (check == 0) {
            System.out.println("Không tìm thấy !");
        }
    }

    //Tìm sách theo thể loại
    private static void findTypeBook(Scanner scanner, Book[] books) {
        int check = 0;
        scanner.nextLine();
        System.out.println("Nhập thể loại sách muốn tìm:");
        String type = scanner.nextLine();
        for (Book book : books) {
            if (book instanceof ScienceBook) {
                if (((ScienceBook) book).getType().equals(type)) {
                    System.out.println(book);
                    check++;
                }
            }
        }
        if (check == 0) {
            System.out.println("Không tìm thấy !");
        }
    }

    //Tính đơn giá trung bình của sách khoa học
    public static void averagePriceScienceBook(double sumPrice, int count) {
        double averagePrice;
        averagePrice = sumPrice / count;
        System.out.printf("Đơn giá trung bình của sách Khoa học: %.2f\n", averagePrice);
    }

    //Tìm sách minPrice
    private static void getMinPriceBook(Book[] books) {
        double minPrice = books[0].getPrice();
        for (int i = 1; i < books.length; i++) {
            if (minPrice > books[i].getPrice()) {
                minPrice = books[i].getPrice();
            }
        }
        System.out.println("Danh sách sách có giá cao nhất:");
        for (Book book : books) {
            if (minPrice == book.getPrice()) {
                System.out.println(book);
            }
        }
    }

    //Tìm sách maxPrice
    private static void getMaxPriceBook(Book[] books) {
        double maxPrice = books[0].getPrice();
        for (int i = 1; i < books.length; i++) {
            if (maxPrice < books[i].getPrice()) {
                maxPrice = books[i].getPrice();
            }
        }
        System.out.println("Danh sách sách có giá cao nhất:");
        for (Book book : books) {
            if (maxPrice == book.getPrice()) {
                System.out.println(book);
            }
        }
    }

    //Tính tổng giá tất cả sách trong mảng
    private static void sumPriceInArray(Book[] books) {
        double sumPrice = 0;
        for (Book book : books) {
            sumPrice += book.getSumPrice();
        }
        System.out.println("Tổng giá tiền tất cả các loại sách = " + sumPrice);
    }

    //Khởi tạo sách Khoa học
    public static ScienceBook createScienceBook(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập tên sách khoa học: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sách khoa học: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập số lượng sách khoa học: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập ngày xuất bản (yyyy/MM/dd): ");
        LocalDate publicationDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập thể loại sách khoa học: ");
        String type = scanner.nextLine();
        return new ScienceBook(name, price, quantity, publicationDate, type);
    }

    //Khởi tạo sách Tiểu thuyết
    public static NovelBook createNovelBook(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập tên sách tiểu thuyết: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sách tiểu thuyết: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập số lượng sách tiểu thuyết: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập ngày xuất bản (yyyy/MM/dd): ");
        LocalDate publicationDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = scanner.nextLine();
        return new NovelBook(name, price, quantity, publicationDate, author);
    }

    //Khởi tạo sách thường
    public static Book createBook(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sách: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập số lượng sách: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập ngày xuất bản (yyyy/MM/dd): ");
        LocalDate publicationDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        return new Book(name, price, quantity, publicationDate);
    }
}
