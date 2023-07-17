import java.util.Scanner;

public class Trendy {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int a = n / 10;
        System.out.println(a);
        int c = a % 10;
        System.out.println(c);
        
        if ( n <= 999) {
            if (c % 3 == 0) {
                System.out.println("Trendy number");
            } else {
                System.out.println("Not a Trendy number");
            }
        } else {
            System.out.println("Not a 3-digit number");
        }
    }
}
