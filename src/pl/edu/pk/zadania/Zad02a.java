package pl.edu.pk.zadania;

import java.util.Scanner;

public class Zad02a {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kwota do zapłaty:");
        double kwotaPoczatkowa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Wybierz metodę płatności (karta, przelew, blik, PAyPal");

        String metoda = scanner.nextLine().toLowerCase();
        double prowizja = 0;

        //logika

        switch (metoda) {
            case "karta":
                prowizja = kwotaPoczatkowa * 0.02;
                break;
            case "przelew":
                prowizja = 1.50;
                break;
            case "blik":
                prowizja = 0;
                break;
            case "paypal":
                prowizja = (kwotaPoczatkowa * 0.04) + 0.80;
                break;
            default:
                System.out.println("Bład");
                return;
        }
        double kwotaKoncowa = kwotaPoczatkowa + prowizja;
        String formatMetoda = metoda.substring(0, 1).toUpperCase() + metoda.substring(1);
        System.out.println("---------PODSUMOWANIE---------");
        System.out.println("");
        System.out.println("");
        System.out.println("---------PODSUMOWANIE---------");



    }
}
