import java.util.Scanner;

public class addsum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int N = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        // Extract each digit from N and calculate the sum of even and odd digits
        while (N != 0) {
            int digit = N % 10;  // Extract the last digit of N
            if (digit % 2 == 0) { 
                evenSum += digit;  // Add the even digit to evenSum
            } else {
                oddSum += digit;  // Add the odd digit to oddSum
            }
            N /= 10;  // Remove the last digit from N
        }

        // Print the sums of even and odd digits
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}

