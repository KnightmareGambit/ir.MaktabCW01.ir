package Question06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the starting number of the series: ");
        int start = input.nextInt();
        System.out.print("Input the number of items for the series: ");
        int n = input.nextInt();
        System.out.print("Input the common difference of the series: ");
        int diff = input.nextInt();

        int sum = 0;
        int current = start;
        System.out.print("The Sum of the series are :\n" + current);
        for (int i = 1; i < n; i++) {
            current += diff;
            sum += current;
            System.out.print(" + " + current);
        }
        System.out.println(" = " + sum);

        input.close();
    }
}
