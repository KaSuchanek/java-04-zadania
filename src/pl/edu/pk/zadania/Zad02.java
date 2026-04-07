package pl.edu.pk.zadania;/*
/ 2.	Napisz program, który symuluje proces płatności w sklepie internetowym.
/ Program pobiera od użytkownika kwotę do zapłaty (liczbę zmiennoprzecinkową),
/ metodę płatności (karta, przelew, blik, PayPal), nastepnie liczy końcową kwotę,
/ doliczając prowizję operacyjną według następujących zasad: karta: prowizja 2% od kwoty,
/ przelew: stała opłata 1.50 zł (niezależnie od kwoty), Blik: brak prowizji (0 zł),
/ PayPal: prowizja 4% od kwoty + stała opłata 0.80 zł. Następnie wyświetlane jest podsumowanie
/ w postaci komunikatu o wybranej
/ metodzie (z wielkiej litery), wartość prowizji o
/ raz ostatecznej kwocie do zapłaty zaokrąglonej do dwóch miejsc po przecinku.*/

//Zadanie 02

import java.util.Scanner;

public class Zad02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kwota do zapłaty: ");
        double kwotaPoczatkowa = scanner.nextDouble();
        scanner.nextLine(); //czyszczenie bufora po liczbie

        System.out.println("Wybierz metodę płatnosci (karta,przelew,blik,paypal: ");
        String metoda = scanner.nextLine().trim().toLowerCase();

        double prowizja = 0;

        //logika liczenia prowizji
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
                prowizja = (kwotaPoczatkowa * 0.04) + 0.8;
                break;
            default:
                System.out.println("Bład metody");
                return; //Jeśli w default użyjesz break, program wypisze komunikat o błędzie, wyjdzie z bloku switch, ale będzie działał dalej.
            //spróbuje obliczyć kwotaKoncowa i wyświetlić podsumowanie, mimo że metoda płatności była błędna.
            // W efekcie użytkownik zobaczy błąd, a zaraz pod nim... nieprawidłowy rachunek.
            //Jeśli użyjesz return, program wypisze komunikat o błędzie i natychmiast zakończy działanie całej metody main.
        }
        double kwotaKoncowa = kwotaPoczatkowa + prowizja;
        String formatMetoda = metoda.substring(0, 1).toUpperCase() + metoda.substring(1);
        //weź wycinek tekstu zaczynający się od pozycji 0, ale skończ przed pozycją 1"
        //plus polaczy tekst a kolejnysubstring obetnie 0 pozycje
        System.out.println("--------Podsumowanie----------");
        System.out.println("Metoda płatności: " + formatMetoda);
        System.out.println("Prowizja wynosi: " + prowizja + " zł.");
        System.out.println("Kwota całkowita wynosi: " + kwotaKoncowa + " zł.");
    }
}

