package src.main;

import java.util.Scanner;

public class ProjetDevops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double b = scanner.nextDouble();

        double somme = a + b;
        double produit = a * b;
        double difference = a - b;

        double division;
        if (b != 0) {
            division = a / b;
        } else {
            System.out.println("Impossible de diviser par zéro !");
            division = Double.NaN;
        }

        System.out.println("\nRésultats :");
        System.out.println("Somme = " + somme);
        System.out.println("Produit = " + produit);
        System.out.println("Différence = " + difference);
        System.out.println("Division = " + division);

        scanner.close();
    }
}
