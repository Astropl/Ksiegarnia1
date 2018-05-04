package SDA;

import java.util.Scanner;

import static SDA.Books.book;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        pierwsza();
    }

    static public void pierwsza() {
        Menu m = new Menu();

        Scanner sc = new Scanner(System.in);
        int wynik;
        do {
            m.menu();
            wynik = sc.nextInt();
            switch (wynik) {
                case 1:
                    System.out.println("Dodoaj ksieake");
                    addBook();
                    break;
                case 2:
                    System.out.println("Wyswietl ksiazki");
                    wyswietlBook();
                    break;
                case 3:
                    System.out.println("nic");
                    break;


            }


        } while (wynik != 0);
    }

    public static void addBook() {
        Books books = new Books();
        books.addBooks();
    }
//        Scanner ksiazka = new Scanner(System.in);
////        Scanner ksiazka1 = new Scanner(System.in);
////        Scanner ksiazka2 = new Scanner(System.in);
//        System.out.println("Podaj tytuł ksiązki");
//        String addtytul = ksiazka.nextLine();
////        ksiazka.nextLine();
//        System.out.println("Podaj Autora Ksiazki");
//        String addAutor = ksiazka.nextLine();
//        //ksiazka.nextLine();
//        System.out.println("Podaj cene ksiazki");
//        double addCena = ksiazka.nextDouble();
//
//        //Book book = new Book();
//
//        book.createBook(1, addtytul, addAutor, addCena);
//
//        System.out.println("Ksiazka dodoana");
//
//    }

    public static void wyswietlBook() {
        Books books = new Books();
        books.wyswietlBook();
    }


}
