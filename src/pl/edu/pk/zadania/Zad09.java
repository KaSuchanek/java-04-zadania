package pl.edu.pk.zadania;/*9.	Napisz program, który rysuje trójkąt prostokątny z gwiazdek,
gdzie każdy kolejny wiersz zawiera o jedną gwiazdkę więcej.
Zadanie09*/

import java.util.Scanner;

public class Zad09 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wysokość trójkąta: ");
        int wysokosc = scanner.nextInt();
//petal zewnetrzna - i = numer wiersza
        for (int i = 1; i <= wysokosc; i++) {
            //teraz bedziemy rysowac gwaizdki - j odpowiada za kolumne
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
