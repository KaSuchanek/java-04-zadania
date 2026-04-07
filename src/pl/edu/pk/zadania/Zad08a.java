package pl.edu.pk.zadania;

import java.util.Scanner;

/*8.	Napisz program, który pobiera kwotę w PLN,
umożliwia wybór waluty (USD, EUR, GBP),
przelicza wartość, a następnie pyta, czy wykonać kolejną transakcję.

Zadanie08a*/
public class Zad08a {
    static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String czyDalej;

        // Kursy walut (przykładowe)
        double usd = 4.02;
        double eur = 4.35;
        double gbp = 5.10;

        do {
            System.out.print("Podaj kwotę w PLN: ");
            double pln = scanner.nextDouble();

            System.out.println("Wybierz walutę docelową: 1-USD, 2-EUR, 3-GBP");
            int wybor = scanner.nextInt();

            double wynik = 0;
            String waluta = "";

            switch (wybor) {
                case 1 -> {
                    wynik = pln / usd;
                    waluta = "USD";
                }
                case 2 -> {
                    wynik = pln / eur;
                    waluta = "EUR";
                }
                case 3 -> {
                    wynik = pln / gbp;
                    waluta = "GBP";
                }
                default -> System.out.println("Nieprawidłowy wybór!");
            }

            if (wynik > 0) {
                System.out.printf("%.2f PLN to ok. %.2f %s\n", pln, wynik, waluta);
            }

            System.out.print("Czy wykonać kolejną transakcję? (tak/nie): ");
            czyDalej = scanner.next();

        } while (czyDalej.equalsIgnoreCase("tak"));

        System.out.println("Dziękujemy za skorzystanie z kantoru!");
    }
}
