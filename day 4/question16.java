import java.util.Scanner;

public class question16  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int num = start; num <= end; num++) {
            int original = num;
            int temp = num;
            int digits = 0;
            int sum = 0;

            // Count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;

            // Calculate sum of powers of digits
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        sc.close();
    }
}