import java.util.Scanner;

public class Lucas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Lucas numbers to print: ");
        int n = scanner.nextInt();

        long startTime = System.nanoTime(); // Start timing

        for (int i = 0; i < n; i++) {
            int lucasNumber = lucas(i);
            System.out.print(lucasNumber + " ");
        }

        long endTime = System.nanoTime(); // End timing
        long executionTime = endTime - startTime;

        System.out.println("\nExecution time: " + executionTime + " nanoseconds");
    }

    public static int lucas(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            return lucas(n - 1) + lucas(n - 2);
        }
    }
}
