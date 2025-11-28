package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class onthelist {   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Enter items (press Enter on empty line to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {  
                break;
            }
            list.add(input);
        }

        System.out.println("Search for?");
        String search = scanner.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

        scanner.close();   
    }
}

    

