package Question01;
import java.util.Scanner;
public class Main {

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Input: num = " + num);
        System.out.println("Output: " + numberOfSteps(num));

        input.close();
    }
}
