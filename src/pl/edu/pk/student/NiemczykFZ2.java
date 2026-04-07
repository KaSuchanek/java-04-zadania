package pl.edu.pk.student;

import java.util.Scanner;

public class NiemczykFZ2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double kwota = 0;

            while (true) {
                try {
                    System.out.print("Podaj kwotę do zapłaty: ");
                    kwota = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wystąpił błąd " + e.getMessage());
                }
            }

            int wybor = 0;
            String metoda = "";
            while (wybor == 0) {
                System.out.println("Podaj metodę płatności: ");
                System.out.println("1. karta");
                System.out.println("2. przelew");
                System.out.println("3. blik");
                System.out.println("4. PayPal");
                wybor = Integer.parseInt(sc.nextLine());
                double prowizja = 0;

                switch (wybor) {
                    case 1:
                        prowizja = Math.round(kwota * 0.02 * 100.00) / 100.00;
                        metoda = "Karta";
                        break;
                    case 2:
                        prowizja = 1.5;
                        metoda = "Przelew";
                        break;
                    case 3:
                        prowizja = 0;
                        metoda = "Blik";
                        break;
                    case 4:
                        prowizja = Math.round((kwota * 0.04 + 0.8) * 100.00) / 100.00;
                        metoda = "PayPal";
                    default:
                        System.out.println("Niepoprawna opcja");
                        wybor = 0;
                        break;
                }

                System.out.println("Podsumowanie:");
                System.out.println("Wybrana metoda: " + metoda);
                System.out.println("Prowizja: " + prowizja);
                System.out.println("Kwota do zapłaty: " + Math.round((kwota + prowizja) * 100.00) / 100.00);

            }


        }
    }




