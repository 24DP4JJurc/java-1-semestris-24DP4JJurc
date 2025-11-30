package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class statistics{

    private int count;
    private int sum;
    private final ArrayList<Integer> list = new ArrayList<>();

    public statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
        this.list.add(number);
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        statistics stats = new statistics();

        System.out.println("Enter numbers (type 0 to stop):");

        while (true) {
            System.out.print("Number: ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            stats.addNumber(input);
        }

        System.out.println("\n--- Results ---");
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Average: " + stats.average());

        scanner.close();
    }
}


