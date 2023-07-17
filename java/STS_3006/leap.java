import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting year: ");
        int a = scanner.nextInt();
        System.out.print("Enter the ending year: ");
        int b = scanner.nextInt();
 
        for(int i=a;i<=b;i++){
            if(i%4==0&&i%100!=0 || i%400==0){
                System.out.println(i);
            }
        }
    }}

