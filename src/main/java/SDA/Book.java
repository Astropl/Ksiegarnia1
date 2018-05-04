package SDA;

public class Book
{ String tytul, autor;
    int id;
    double cena;

    public Book(String nazwa, String autor, double cena) {
    }

    public Book(int id, String tytul, String autor, double cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.id = id;
        this.cena = cena;
    }

    @Override
    public String toString() {//30 gwaizdek
        return "********************************"
                +"\n* ID :"+id+"                        *"
                +"\n* Tytuł :"+tytul+"                  *"
                +"\n* Autor : "+autor+"         *"
                +"\n* Cena : "+cena+"                   *"
                +"\n********************************";
        //return "Book{" + "tytul='" + tytul + '\'' + ", autor='" + autor + '\'' + ", id=" + id + ", cena=" + cena + '}';
    }
//    public static void createBook (int id, String tytul, String autor,  double cena)
//    {
//        Books books = new Books();
//       books.addBooks(id, tytul,autor,cena);
//
//
//    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
