import java.util.Scanner;

public class Fab {

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void series(int n){
        int a=0;
        int b=1;
        System.out.print(0+" ");
        System.out.print(1+" ");
        for(int i=0;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        series(n);
     

    
    }

}
