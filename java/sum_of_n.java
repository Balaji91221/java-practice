import java.util.Scanner;
public class sum_of_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;

        while(i <=n){ // while loop
            sum = sum + i; 
            i = i + 1;      
        }
        System.out.println(sum);
    }
    
}
//logic of the program
// 1. take input from the user
// 2. initialize the variables
// 3. run the loop
// 4. print the output
// 5. end the program
// formula for sum of n natural numbers
// i=1  sum=0
// i=2  sum=0+1
// i=3  sum=0+1+2
// i=4  sum=0+1+2+3
// i=5  sum=0+1+2+3+4
// i=6  sum=0+1+2+3+4+5
// i=7  sum=0+1+2+3+4+5+6
// i=8  sum=0+1+2+3+4+5+6+7
// i=9  sum=0+1+2+3+4+5+6+7+8
// i=10 sum=0+1+2+3+4+5+6+7+8+9