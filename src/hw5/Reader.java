package hw5;

import java.util.Arrays;

public class Reader {

    private String fullName;
    private int numberLibraryCard;
    private String faculty;
    private String dateBirth;
    private String phone;

    public Reader(String fullName, int numberLibraryCard, String faculty, String dateBirth, String phone) {
        this.fullName = fullName;
        this.numberLibraryCard = numberLibraryCard;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phone = phone;
    }

    public void takeBook(int numberBooks) {
        System.out.println(fullName + " took " + numberBooks + " books.");
    }

    public void takeBook(String... titles) {
        System.out.println(fullName + " took next books: ");
        for (String title : titles) {
            System.out.println(title);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(fullName + " return next books: ");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void returnBook(int numberBooks) {
        System.out.println(fullName + " return " + numberBooks + " books.");
    }

    public void returnBook(String... titles) {
        System.out.println(fullName + " return next books: ");
        for (String title : titles) {
            System.out.println(title);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(fullName + " took next books: ");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    @Override
    public String toString() {
        return "fullName: " + fullName + ", numberLibraryCard: " + numberLibraryCard + ", faculty: "
                + faculty + ", dateBirth: " + dateBirth + ", phone: " + phone;
    }
}
