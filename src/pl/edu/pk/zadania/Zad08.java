package pl.edu.pk.zadania;

import java.util.Scanner;

/*Napisz program, który pobiera kwotę w PLN,
umożliwia wybór waluty (USD, EUR, GBP),
przelicza wartość, a następnie pyta, czy wykonać kolejną transakcję.

Zadanie08*/
public class Zad08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kursUSD = 4.02;
        double kursEUR = 4.35;
        double kursGBP = 5.10;

        String decyzja;

        do {
            System.out.print("Podaj kwotę w PLN: ");
            double pln = scanner.nextDouble();

            System.out.println("Wybierz walutę: 1-USD, 2-EUR, 3-GBP");
            int wybor = scanner.nextInt();

            double suma = 0; //suma to taki "pudełko", do którego wkładasz przeliczoną kasę, żeby za chwilę ładnie ją pokazać na ekranie.
            String waluta = "";
            if (wybor == 1) {
                suma = pln / 4.05;
                waluta = "USD";
            } else if (wybor == 2) {
                suma = pln / 4.35;
                waluta = "EUR";

            } else if (wybor == 3) {
                suma = pln / 5.10;
                waluta = "GBP";
            } else {
                System.out.println("Nieprawidłowy wybór waluty.");
            }
            if (suma > 0) {
                System.out.printf("Wynik: %.2f %s\n", suma, waluta);
            }
            System.out.print("Czy wykonać kolejną transakcję? (tak/nie): ");
            decyzja = scanner.next();
        } while (decyzja.equalsIgnoreCase("tak"));
        System.out.println("Koniec programu");
    }
}
