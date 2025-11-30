package rvt;

import java.util.Scanner;

public class paymentcard {

    private double balance;

    public paymentcard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        } else {
            System.out.println("Not enough money for affordable meal.");
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        } else {
            System.out.println("Not enough money for hearty meal.");
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > 150) {
                this.balance = 150;
            }
        } else {
            System.out.println("Cannot add negative amount!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        paymentcard card = new paymentcard(10.00);  
        System.out.println(card);

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1 = Eat affordably (2.60€)");
            System.out.println("2 = Eat heartily (4.60€)");
            System.out.println("3 = Add money");
            System.out.println("0 = Exit");

            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                card.eatAffordably();
            } else if (choice == 2) {
                card.eatHeartily();
            } else if (choice == 3) {
                System.out.print("Enter amount to add: ");
                double amount = scanner.nextDouble();
                card.addMoney(amount);
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.println(card);
        }

        System.out.println("\nGoodbye!");
        scanner.close();
    }
}

    

