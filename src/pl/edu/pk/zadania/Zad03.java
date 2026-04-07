package pl.edu.pk.zadania;/*3.	Napisz program, który pełni rolę testera siły hasła.
Program poprosi użytkownika o wpisanie hasła, odczyta hasło i policzyć,
z ilu znaków się składa. Program przypisze hasło do jednej z trzech kategorii:
słabe: jeśli hasło ma mniej niż 8 znaków, średnie: jeśli hasło ma od 8 do 12 znaków,
mocne: jeśli hasło ma więcej niż 12 znaków. Na końcu program wyświetli użytkownikowi informację
o kategorii hasła oraz podać dokładną liczbę znaków, które wpisał.

Zadanie03*/

import java.util.Scanner;

public class Zad03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło:");
        String haslo = scanner.nextLine();
        int dlugosc = haslo.length();
        String silaHasla;
//logika
        if (dlugosc < 8) {
            silaHasla = "Słabe";
        } else if (dlugosc <= 12) {
            silaHasla = "Średnie";
        } else {
            silaHasla = "Mocne";
        }
        System.out.println("Twoje hasło ma długość " + dlugosc + " znaków i jest " + silaHasla.toUpperCase());
    }
}
