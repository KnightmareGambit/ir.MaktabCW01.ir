package Question03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int sum = 0;
        int count = 0;

        System.out.println("First " + n + " odd natural numbers:");
        for (int i = 1; count < n; i += 2) {
            System.out.println(i);
            sum += i;
            count++;
        }

        System.out.println("Sum of the first " + n + " odd natural numbers: " + sum);

        input.close();
    }
}
