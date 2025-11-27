package rvt;

import java.util.Scanner;

public class skaitluanalize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitivu skaitli (0 vai negativs skaitlis partrauc ievadi): ");
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }

            count++;
            sum += num;

            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("\n--- Rezultats ---");
        System.out.println("Ievadito skaitlu skaits: " + count);
        System.out.println("Skaitlu summa: " + sum);

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Videja vertiba: " + avg);
            System.out.println("Lielakais skaitlis: " + max);
            System.out.println("Mazakais skaitlis: " + min);
        } else {
            System.out.println("Netika ievadits neviens pozitivs skaitlis.");
        }
    }
}
