package GFG.Mathematic_problems;
import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        
        while (n != 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }
        
        if (original == reversed) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
