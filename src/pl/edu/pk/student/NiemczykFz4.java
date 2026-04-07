package pl.edu.pk.student;

import java.util.Scanner;

public class NiemczykFz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dochod = 0;

        while (true) {
            try {
                System.out.print("Podaj roczny dochód: ");
                dochod = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wystąpił błąd " + e.getMessage());
            }
        }

        double podatek = 0.0;

        if (dochod <= 120000) {
            podatek = Math.round(dochod * 0.12 * 100.00) / 100.00;
        } else {
            podatek = Math.round((120000 * 0.12 + (dochod - 120000) * 0.32) * 100.00) / 100.00;
        }

        double netto = dochod - podatek;

        System.out.println("Dochód brutto: " + dochod);
        System.out.println("Podatek: " + podatek);
        System.out.println("Netto: " + netto);
    }
}
