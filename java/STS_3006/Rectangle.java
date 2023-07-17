import java.util.*;
public class Rectangle {
    public static void main(String args[]){
        int l,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length");
        l = s.nextInt();
        System.out.println("Enter the breadth");
        b = s.nextInt();
        int Area = l*b;
        int perimeter=2*(l+b);
        System.out.println("Area of rectangle is"+Area);
        System.out.println("Perimeter of rectangle is"+perimeter);

    }
}
