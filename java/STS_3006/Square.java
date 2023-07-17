import java.util.*;
public class Square {
    public static void  main(String args[]){
        int a ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        a = s.nextInt();
       
        int Area = a*a;
        int primter = 4*a;
        System.out.println("Area of square is"+Area);
        System.out.println("Perimeter of square is"+primter);
        
    }
}
