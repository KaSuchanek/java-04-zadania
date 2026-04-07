package pl.edu.pk.zadania;/*
 * 10.	Napisz program, który prosi użytkownika o podanie kodu PIN.
 * Użytkownik ma maksymalnie 3 próby.
 * Po trzech błędnych próbach program wyświetla komunikat o blokadzie karty.
 * Zadanie05*/

import java.util.Scanner;

public class Zad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inicjalizacja danych
        String poprawnyPin = "1234";
        int proby = 0;
        int maxProby = 3;
        boolean zalogowano = false; //Zanim zaczniesz, nie jesteś jeszcze zalogowany, dlatego ustawiamy false (fałsz)

        while (proby < maxProby && !zalogowano) {//  Warunek pętli while (!zalogowany) pytanie „Czy to prawda, że NIE jesteś zalogowany?”.”.
            System.out.print("Podaj kod PIN (Próba " + (proby + 1) + " z " + maxProby + "): ");
            String wpisanyPIN = scanner.next();
            if (wpisanyPIN.equals(poprawnyPin)) {
                zalogowano = true; //zmieniamy flage aby wpuscic uzytkowanika
            } else {
                proby++;
                System.out.println("Niepoprawny PIN");  /*Początek: proby = 0, zalogowano = false. Pętla startuje, bo 0 < 3 oraz !false
                                                        (czyli prawda). Wpisujesz PIN. Jeśli DOBRY: Wykonuje się zalogowano = true.
                                                        Pętla wraca na górę, widzi !true (fałsz) i kończy działanie. Jeśli ZŁY:
                                                        Wykonuje się proby++. Pętla wraca na górę, sprawdza czy proby < 3.
                                                        Jeśli tak – pyta znowu.*/
                if (proby < maxProby) {
                    System.out.println("Wprowadz PIN ponownie");
                }
            }
        }
        if (zalogowano) {
            System.out.println("\nZalogowano pomyślnie! Witaj w systemie.");
        } else {
            System.out.println("\nBŁĄD: Przekroczono limit prób. KARTA ZABLOKOWANA!");
        }
        scanner.close();
    }
}
