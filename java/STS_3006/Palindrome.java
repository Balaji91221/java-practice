import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String s = scanner.nextLine();

        StringBuffer sbr = new StringBuffer(s);
        String x = sbr.reverse().toString();
        if (s.equals(x)) {
            System.out.println("Yes, it is a palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }
    
}
}
