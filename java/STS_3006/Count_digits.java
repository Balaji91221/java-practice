import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        String numberString = Integer.toString(n);
        int digitCount = numberString.length();
        System.out.println("Number of digits: " + digitCount);
    
}
}

//String numberString = Integer.toString(n);
//int digitCount =numberString.length();