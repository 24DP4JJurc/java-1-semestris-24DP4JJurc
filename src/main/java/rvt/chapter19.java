package rvt;
import java.util.Scanner;

public class chapter19 {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start: ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter End:");
        int end = Integer.valueOf(scanner.nextLine());;

        while (true) {
            if (start <= end) {
                System.out.println(start);
                start += 1;
                // start++
            }
        }   
    }
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

    }
}
