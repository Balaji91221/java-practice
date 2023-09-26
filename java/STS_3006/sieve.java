import java.util.*;

public class sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create an array to store whether a number is prime or not.
        boolean[] prime = new boolean[n + 1];

        // Assume all numbers are prime initially.
        Arrays.fill(prime, true);

        // 0 and 1 are not prime, so mark them as false.
        prime[0] = false;
        prime[1] = false;

        // Start the sieve algorithm from 2 (the first prime number).
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                // If i is prime, mark all multiples of i as non-prime.
                // Starting from i*i, as all smaller multiples would have already been marked.
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Printing the prime numbers.
        for (int i = 0; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
                
            }
        }
    }
}





// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         LinkedList<Integer> primes = new LinkedList<>();
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         int m = s.nextInt();
//         boolean[] isComposite = new boolean[m + 1];

//         for (int i = 2; i * i <= m; i++) {
//             if (!isComposite[i]) {
//                 for (int j = i * i; j <= m; j += i) {
//                     isComposite[j] = true;
//                 }
//             }
//         }

//         for (int i = n; i <= m; i++) {
//             if (!isComposite[i]) {
//                 primes.add(i);
//             }
//         }

//         System.out.print("Prime numbers between " + n + " and " + m + ": ");
//         for (int i = 0; i < primes.size(); i++) {
//             System.out.print(primes.get(i) + " ");
//         }
//     }
// }



//sieve elaborated
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         LinkedList<Integer> primes = new LinkedList<>();
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         boolean[] isComposite = new boolean[n + 1];

//         for (int i = 2; i * i <= n; i++) {
//             if (!isComposite[i]) {
//                 for (int j = i * i; j <= n; j += i) {
//                     isComposite[j] = true;
//                 }
//             }
//         }

//         for (int i = 2; i <= n; i++) {
//             if (!isComposite[i]) {
//                 primes.add(i);
//             }
//         }

//         System.out.print("Prime numbers up to " + n + ": ");
//         for (int i = 0; i < primes.size(); i++) {
//             System.out.print(primes.get(i) + " ");
//         }
//     }
// }

