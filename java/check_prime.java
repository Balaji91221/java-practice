// import java.util.Scanner;
// public class check_prime {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int n = s.nextInt();//
//         int div = 2;// we are starting from 2 because every number is divisible by 1
//         boolean flag = true;// we are assuming that the number is prime
//         while(div <= n-1){// we are checking till n-1 because n is not prime
//             if(n % div == 0){ // if remainder is 0 then it is not prime
               
//                  flag = false;// if the number is not prime then we are changing the flag to false
              
//             }
//             div = div + 1;// we are incrementing the div by 1
//         }
//         if(flag == true){// if the flag is true then the number is prime
//             System.out.println("Prime");// if the number is prime then we are printing prime
//         }
//         else{
//             System.out.println("Not Prime");
//         }

      
        
//     }
    
// }
//find the nth of a prime number
// Path: nth_prime.java
import java.util.Scanner;
public class check_prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int num = 2;
        while(count < n){// we are checking till count is less than n
            int div = 2;// we are starting from 2 because every number is divisible by 1
            boolean flag = true;// we are assuming that the number is prime
            while(div <= num-1){// we are checking till n-1 because n is not prime
                if(num % div == 0){// if remainder is 0 then it is not prime
                    flag = false;// if the number is not prime then we are changing the flag to false
                }
                div = div + 1;// we are incrementing the div by 1
            }
            if(flag == true){// if the flag is true then the number is prime
                count = count + 1;// if the number is prime then we are incrementing the count by 1
            }
            num = num + 1;// we are incrementing the num by 1
        }
        System.out.println(num-1);// we are printing the num-1 because the last number which we have incremented is not prime
    }

}
//find the sum of the digits of a number
