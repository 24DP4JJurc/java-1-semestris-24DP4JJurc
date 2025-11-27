package rvt;

import java.util.Scanner;

public class delikatese {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String product = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double price = scanner.nextDouble();

        System.out.print("Ekspress piegade (0=ne, 1=ja): ");
        int express = scanner.nextInt();

        double delivery = 0;

        if (price >= 10) {
            delivery = 0;
        } else if (price >= 2) {
            delivery = 2;
        } else {
            delivery = 10;
        }

        if (express == 1) {
            delivery += 3;
        }

        double total = price + delivery;

        System.out.println("\nRekins:");
        System.out.println("Prece: " + product);
        System.out.println("Cena: " + price + " EUR");
        System.out.println("Piegade: " + delivery + " EUR");
        System.out.println("Kopa: " + total + " EUR");


        scanner.close();
    }
}


