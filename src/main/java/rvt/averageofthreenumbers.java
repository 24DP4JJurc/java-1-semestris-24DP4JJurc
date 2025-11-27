package rvt;

import java.util.Scanner;

public class averageofthreenumbers {


        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        double average = 1.0 * (first + second + third) / 3;

        System.out.println("The average is " + average);
    }
}
