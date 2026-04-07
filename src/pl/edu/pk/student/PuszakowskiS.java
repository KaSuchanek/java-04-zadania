package pl.edu.pk.student;

import java.util.Scanner;

public class PuszakowskiS {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Prosze podaj haslo");
        String haslo = skaner.nextLine();
        int dlugosc = haslo.length();
        String kategoria;


        if (dlugosc < 8) {
            kategoria = "słabe";
        }
        else if (dlugosc <= 12) {
            kategoria = "średnie";
        }
        else {
            kategoria = "mocne";
        }
        System.out.println("Twoje hasło ma " + dlugosc + " znaków.");
        System.out.println("Kategoria hasła: " + kategoria);
        skaner.close();
    }
}
