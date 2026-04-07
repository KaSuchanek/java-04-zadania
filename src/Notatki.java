import java.util.Scanner;

public class Notatki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kursUSD = 4.02;
        double kursEur = 4.02;
        double kursGbp = 4.02;
        double suma = 0;
        String waluta = "";
        String decyzja = "";

        // klasyczne do while dodajemy zeby zapytac o wybor

        do {
            System.out.println("PLN: ");
            double pln = scanner.nextDouble();

            System.out.println("1- usd, 2- eur, 3- gbp");
            int wybor = scanner.nextInt();
            scanner.nextLine();
            if (wybor == 1) {
                suma = pln / kursUSD;
                waluta = "usd";

            } else if (wybor == 2) {
                suma = pln / kursEur;
                waluta = "eur";
            } else if (wybor == 3) {
                suma = pln / kursGbp;
                waluta = "gbp";
            } else {
                System.out.println("nieprwidlowy");
            }
            if (suma > 0) {
                System.out.println(suma + " , " + waluta);
            }
            System.out.println("idziemy dalej? Tak/nie");
            decyzja = scanner.nextLine();
        } while (decyzja.equalsIgnoreCase("tak"));
        System.out.println("koniec");
    }
}