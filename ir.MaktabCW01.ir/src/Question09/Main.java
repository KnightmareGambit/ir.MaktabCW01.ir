package Question09;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n (1 <= n <= 19): ");
        int n = input.nextInt();

        printDiamonds(n);

        input.close();
    }

    public static void printDiamonds(int n) {
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            printStars(i);
            printSpaces(2 * (n - i));
            printStars(i);
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            printSpaces(n - i);
            printStars(i);
            printSpaces(2 * (n - i));
            printStars(i);
            System.out.println();
        }
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }
}
