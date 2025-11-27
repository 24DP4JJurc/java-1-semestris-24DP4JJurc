package rvt;

import java.util.Scanner;

public class detalas {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int PRICE_BOLT = 7;
        final int PRICE_NUT = 4;
        final int PRICE_WASHER = 2;

        System.out.println("Ievadi skruves, uzgrieznus un paplaksnes :");
        int bolts = sc.nextInt();
        int nuts = sc.nextInt();
        int washers = sc.nextInt();

        System.out.println("\nRezultats");

        if (nuts < bolts & washers < bolts * 2) {
            System.out.println("Kluda: par maz uzgrieznu un paplaksnu.");
        } 
        else if (nuts < bolts) {
            System.out.println("Kluda: par maz uzgrieznu.");
        } 
        else if (washers < bolts * 2) {
            System.out.println("Kluda: par maz paplaksnu.");
        } 
        else {
            System.out.println("Pasutijums ir kartiba! ✔");
        }

        int totalCost = bolts * PRICE_BOLT + nuts * PRICE_NUT + washers * PRICE_WASHER;
        System.out.println("Kopeja cena centos: " + totalCost);
    }
}

    
