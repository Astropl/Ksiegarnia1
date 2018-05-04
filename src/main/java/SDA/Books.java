package SDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books

{
    public static List bookList = new ArrayList<>();
    //List<Book> bookList = new ArrayList <>();
    static Scanner sc = new Scanner(System.in);
    private static int id;
    private static String nazwa;
    private static String autor;
    private static double cena;
    static Book book = new Book(nazwa, autor, cena);
    public static BooksSave booksSave;


//    public Books(List <Book> bookList) {
//        this.bookList = bookList;
//    }

    public Books() {

    }


//    public String toString() {
//        return "Books{" +
//                "bookList=" + bookList +
//                '}';
//    }

    public void addBooks() {
        id = 1;
        System.out.println(" Podaj tytuł ksiazki");
        nazwa = sc.nextLine();
        System.out.println(" Podaj nazwisko autora ");
        autor = sc.nextLine();
        System.out.println(" Podaj cene ksiazki");
        cena = sc.nextDouble();

        book = new Book(id, nazwa, autor, cena);
        bookList.add(book);

        booksSave.bookSave();
        //System.out.println(bookList.get());
        //bookList.add( id,nazwa,autor,cena);

        wyswietlBook();

    }

    public void wyswietlBook() {
        for (int i = 0; i < bookList.size(); i++)

            System.out.println(bookList.get(i));
    }
}
