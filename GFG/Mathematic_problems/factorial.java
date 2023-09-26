package GFG.Mathematic_problems;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;//fact*=i;
        
        }   
        System.out.println(fact);
    }
    
}//iterative method
//recursive method
// public static int fact(int n){
//     if(n==0){
//         return 1;
//     }
//     return n*fact(n-1);
