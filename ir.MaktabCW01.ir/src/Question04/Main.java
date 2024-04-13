package Question04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of terms: ");
        int n = input.nextInt();

        int sum = 0;
        int term = 0;
        int currentTerm = 1;

        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++) {
            term = term * 10 + 1;
            sum += term;
            System.out.print(term);
            if (i != n) {
                System.out.print(" + ");
            }
            currentTerm = term;
        }

        System.out.println("\nThe Sum is: " + sum);

        input.close();
    }
}
