package pl.edu.pk.zadania;/*Napisz program, który sprawdza, czy z trzech podanych boków można zbudować trójkąt
(warunek: suma dwóch dowolnych boków musi być większa od trzeciego).

Zadanie07*/

import java.util.Scanner;

public class Zad07 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj trzy boki trójkąta (odzielone spacjami):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z podanych boków MOŻNA zbudować trójkąt.");

            // Opcjonalnie: sprawdzenie czy jest prostokątny (Tw. Pitagorasa)
            if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.println("Dodatkowo: Jest to trójkąt prostokątny!");
            }
        } else {
            System.out.println("Z podanych boków NIE MOŻNA zbudować trójkąta.");
        }
    }
}
