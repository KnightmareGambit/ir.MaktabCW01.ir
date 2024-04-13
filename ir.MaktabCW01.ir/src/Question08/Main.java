package Question08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number in base 10 (0 <= n <= 231-1): ");
        int n = input.nextInt();
        System.out.print("Enter the base (2 <= b <= 16): ");
        int b = input.nextInt();

        String result = convertToBase(n, b);

        System.out.println("The number " + n + " in base " + b + " is: " + result);

        input.close();
    }

    public static String convertToBase(int n, int b) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int digit = n % b;
            char digitChar;
            if (digit < 10) {
                digitChar = (char) (digit + '0');
            } else {
                digitChar = (char) (digit - 10 + 'A');
            }
            result.insert(0, digitChar);
            n /= b;
        }

        return result.toString();
    }
}
