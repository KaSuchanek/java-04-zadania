package pl.edu.pk.zadania;/*
 * Napisz program, który pobiera od użytkownika wiek oraz kraj zamieszkania,
 * a następnie sprawdza, czy użytkownik może kupić wybrany produkt objęty
 * ograniczeniem wiekowym. Przyjmij,
 * że w części krajów minimalny wiek to 18 lat, a w innych 21 lat*/

/*Scanner, String, if / else,
equals(), operatory logiczne &&, ||*/
//Zadanie 01

import java.util.Scanner;

public class Zad01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();
        scanner.nextLine(); //musimy wyczyscic bufor, Metoda nextInt() czyta liczbę,
        // ale zostawia w pamięci znak nowej linii, gdy naciskasz "Enter", kolejne nextLine() (to od kraju) od razu "zobaczy"
        // zostawiony Enter - uzna że koniec wpiywania i w karju bedzie pusta linia

        System.out.println("Podaj kraj zamieskzania: ");
        String krajZamieszkania = scanner.nextLine(); //mozemy tez metoda .trim() uciac niepotrzeben spacje na koncu i poczatku

        int wymaganyWiek;

// logika: jaki kraj taki wiek

        switch (krajZamieszkania.toLowerCase()) { //jesli zostawimy tylko zmienna, gdy ktos wpisze duze litery program sie wykrzaczy .toLowerCase
            case "usa":
                wymaganyWiek = 21;
                break;
            case "japonia":
            case "islandia":
                wymaganyWiek = 20;
                break;
            default:
                wymaganyWiek = 18;
                break;
        }
        //sparwdzmy warunek
        if (wiek >= wymaganyWiek) {
            System.out.println("Możesz kupić alkohol w kraju " + krajZamieszkania.toUpperCase() +".");
        } else {
            System.out.println("Niestyt, w " + krajZamieszkania.toUpperCase() + " musisz mieć ukończone " + wymaganyWiek + " lat, żeby kupić alkohol.");
        }
    }
}
