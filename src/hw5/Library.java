package hw5;

import org.w3c.dom.ls.LSOutput;

public class Library {
    public static void main(String[] args) {

        Book[] arrayBooks =
                {new Book("IT", "S.King", 2000),
                        new Book("Generation Pi", "V.Pelevin", 2005),
                        new Book("Dune", "F.Herbert ", 1965),
                        new Book("War and Peace", "L.Tolstoy", 1873),
                        new Book("Idiot", "F.Dostoevskiy", 1958)};

        Reader[] arrayReaders =
                {new Reader("Petrov V.V.", 1213, "Literary ", "18.08.1977", "050-236-12-15"),
                        new Reader("Ivanov A.A.", 0236, "Physical ", "12.01.1985", "067-145-14-00"),
                        new Reader("Sidorov B.G.", 5677, "Mathematical ", "01.01.1983", "099-111-10-99")};

        System.out.println("All books:");
        for (Book book:arrayBooks) {
            System.out.println(book.toString());
        }

        System.out.println();

        System.out.println("All readers:");
        for (Reader reader:arrayReaders) {
            System.out.println(reader.toString());
        }

        System.out.println();

        System.out.println("Demonstration of overloading methods \"takeBook\"");
        System.out.println();
        arrayReaders[0].takeBook(arrayBooks[0], arrayBooks[1]);
        System.out.println();
        arrayReaders[1].takeBook(arrayBooks[3].getTitle(), arrayBooks[4].getTitle());
        System.out.println();
        arrayReaders[2].takeBook(2);
        System.out.println();

        System.out.println("Demonstration of overloading methods \"returnBook\"");
        System.out.println();
        arrayReaders[0].returnBook(arrayBooks[2], arrayBooks[3]);
        System.out.println();
        arrayReaders[1].returnBook(arrayBooks[3].getTitle(), arrayBooks[4].getTitle());
        System.out.println();
        arrayReaders[2].returnBook(2);
        System.out.println();
    }
}
