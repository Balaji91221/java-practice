import java.util.*;
public class Cel_Fah {
    public static void main(String args[]){
        double c,f;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius");
        c = s.nextDouble();
        f = (c*9/5)+32;//f=(c*9/5)+32
        System.out.println("Temperature in fahrenheit is "+f);
        
    }
    
}
