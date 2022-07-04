package Homework_1_10;

public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Lev", "Tolstoy");
        Author chekhov = new Author("Anton", "Chekhov" );


        Book warAndPeace = new Book("'War and peace'", tolstoy, 1989);
        Book annaKarenina = new Book("'Anna Karenina'", tolstoy, 1989);
        Book cherryOrchard = new Book("'Cherry Orchard'", chekhov, 1976);


        System.out.println(warAndPeace);
        System.out.println(annaKarenina);
        System.out.println(cherryOrchard);

    }
}
