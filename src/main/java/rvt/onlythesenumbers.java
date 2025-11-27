package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class onlythesenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        System.out.println("From where? (index starting at 1)");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? (index starting at 1)");
        int end = Integer.valueOf(scanner.nextLine());

        start = start - 1;
        end = end - 1;

        if (start < 0 || end >= numbers.size() || start > end) {
            System.out.println("Invalid range!");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.println(numbers.get(i));
            }
        }

        scanner.close();
    }
}

    

