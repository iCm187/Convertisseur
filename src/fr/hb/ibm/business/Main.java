package fr.hb.ibm.business;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le convertisseur de distance !");
        int choix;

        do {
            System.out.println("Veuillez choisir l'option de conversion :");
            System.out.println("1. Kilomètres vers Miles");
            System.out.println("2. Miles vers Kilomètres");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();

            if (choix == 1) {
                convertirKilometresEnMiles();
            } else if (choix == 2) {
                convertirMilesEnKilometres();
            } else {
                System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        } while (choix != 1 && choix != 2);
    }

    public static void convertirKilometresEnMiles() {
        final double TAUX1 = 0.621371;
        double kilometers;

        System.out.print("Veuillez entrer le nombre de kilomètres : ");
        Scanner scanner = new Scanner(System.in);
        kilometers = scanner.nextDouble();

        double miles = kilometers * TAUX1;

        System.out.println(kilometers + " kilomètres équivalent à " + miles + " miles");
    }

    public static void convertirMilesEnKilometres() {
        final double TAUX2 = 1.609;
        double miles;

        System.out.print("Veuillez entrer le nombre de miles : ");
        Scanner scanner = new Scanner(System.in);
        miles = scanner.nextDouble();

        double kilometers = miles * TAUX2;

        System.out.println(miles + " miles équivalent à " + kilometers + " kilomètres");
    }
}
