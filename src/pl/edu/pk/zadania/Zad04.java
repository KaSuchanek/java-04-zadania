package pl.edu.pk.zadania;/*4.	Napisz program, który pobiera dochód roczny użytkownika i oblicza podatek według zasad:
12% do 120 000 zł, a powyżej tej kwoty 32% od nadwyżki.
Program wyświetli obliczony podatek oraz kwotę netto (dochód minus podatek).
Wszystkie wyniki finansowe zaokrągli do dwóch miejsc po przecinku

Zadanie04*/

import java.util.Scanner;

public class Zad04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swój roczny dochód brutto (zł): ");
        double dochod = scanner.nextDouble();

        double podatek = 0;
        double prog = 120000;
        //podatek progresywny logika
        if (dochod < prog) {
            podatek = dochod * 0.12;
        } else {
            double podatekDrugiProg = dochod - prog;
            podatek = (dochod * 0.12) + (podatekDrugiProg * 0.32);
        }
        double dochodNetto = dochod - podatek;
        System.out.println("\n--- ROZLICZENIE ROCZNE ---");
        System.out.printf("Dochód brutto: %.2f zł\n", dochod);
        System.out.printf("Należny podatek: %.2f zł\n", podatek);
        System.out.println("--------------------------");
        System.out.printf("Kwota netto (na rękę): %.2f zł\n", dochodNetto);

        scanner.close();
    }
}
