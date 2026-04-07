package pl.edu.pk.zadania;/*Napisz program, który zarządza załadunkiem palety o limicie 1000 kg,
program ma nie pozwalać na wpisanie wagi mniejszej lub równej 0 kg,
program powinien informować, gdy zostanie tylko 10% wolnego miejsca.
Na koniec program ma wyświetlić raport: całkowitą wagę, liczbę paczek,
średnią wagę paczki oraz wagę najcięższej z nich.

Zadanie06*/

import java.util.Scanner;

public class Zad06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaWag = 0;
        double limit = 1000;
        int liczbaPaczek = 0;

        System.out.println("--- System Przyjmowania Towaru ---");
        System.out.println("Dodawaj paczki. System zatrzyma się po przekroczeniu " + limit + " kg.");

        while (sumaWag <= limit) {
            System.out.println("Podaj wagę kolejnej paczki (kg) :");
            double wagaPaczki = scanner.nextDouble();
            //walidacja wagi
            if (wagaPaczki <= 0) {
                System.out.println("BŁĄD: Waga musi być większa od zera!");
                continue; // Przeskakuje resztę kodu w pętli i pyta od nowa
            }
            sumaWag += wagaPaczki; //uproszczony zapis sumaWag = sumaWag + wagaPaczki;
            liczbaPaczek++;
            System.out.println("Aktualnie na palecie mamy " + sumaWag);
            if (sumaWag >= limit * 0.9 && sumaWag < limit)
                System.out.println("!!! UWAGA: Zostało mniej niż 10% miejsca (" + (limit - sumaWag) + " kg) !!!");
        }
        // Komunikat po wyjściu z pętli (gdy suma przekroczyła 1000)
        System.out.println("\n--- ALERT: LIMIT PRZEKROCZONY ---");
        System.out.println("Łączna waga: " + sumaWag + " kg");
        System.out.println("Liczba przyjętych paczek: " + liczbaPaczek);
        System.out.println("Przeładowanie o: " + (sumaWag - limit) + " kg!");
    }
}
