import java.util.*;

public class sts {

    // Qst-01
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


    // Qst-02
    public static void digitCount(int n){
        String s=Integer.toString(n);
        System.out.println("==> "+s.length());
    }

    // Qst-03
public static void isPalindrom(int n){
        String s=Integer.toString(n);
        StringBuffer sbr = new StringBuffer(s);
        String x = sbr.reverse().toString();
        if(s.equals(x)){
            System.out.println("yes,pal");
        }else{
            System.out.println("No,pal");
        }
}

// Qst-04
public static void fact(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    System.out.println(fact);
}

    // Qst-05
public static void isPrime(int n){
    int c=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            //System.out.println(i);
            c++;
        }
    }
    if(c==2){
            System.out.println("prime");
        }else{
            System.out.println("nope");
        }
}

 public static int isprime2(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return -1;
      }
    }
    return 1;
  }

public static void primeSeries(int a,int b){
    for (int i = a; i <= b; i++) {
      if (isprime2(i) == 1) {
        System.out.print(i + " ");
      }
    }
  }
    
// Qst-06 : Swapping numbers without using a third variable
    public static void swap(int a, int b){
        System.out.println("before swap:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

// Qut -07 Write a program to calculate the number of words in a given string

public static void words(String s){
    int c=0;
    String[] x= s.split(" ");
   for (String a1 : x)
            c++;

   System.out.println(c);
}
// Qut -08
public static void sumOfnum(Float n){
    float sum=n*(n+1)/2;
    System.out.println("sum="+sum);
}

// Qut-09
public static void larSmaNum(int a[]){
   Arrays.sort(a);
   System.out.println("max="+a[a.length-1]);
   System.out.println("min="+a[0]);
}

public static void binaryAddition(String n1,String n2){
    int num1=Integer.parseInt(n1,2);
    int num2=Integer.parseInt(n2,2);
    String res=Integer.toBinaryString((num1+num2));
    String res1=Integer.toHexString((num1+num2));

    System.out.println(num1+"+"+num2+"="+res+" => "+res1);
    
}

// 1. patterns program
// 2. simple interest
// 3. Area of rectangle, perimeter
// 4. celsius to fahrenheit convertor
// 5. A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3. Examples of trendy numbers: 131, 264, 999 examples of non trendy numbers : 123, 653, 33, 4, 1034 write a program to find whether a given number is a trendy number or not.
// 6. Write a program in Java to generate the Nth Fibonacci Number .
// 7.  Write a program in Java to count the digits in a number.
// 8. Check If String/Number is palindrome or not
// 9. Write a program to find factorial of number?
// 10. How to check number is prime or not?
// 11. How to print Prime number from 1 to 100?

// 12. Swapping numbers without using a third variable

// 13.  Write a program to calculate the number of words in a given string
public static void wordInStr(String str){
    String[] words = str.split(" ");
    System.out.println(words.length);
}
// 14.  Armstrong Number in Java
public static void Armstrong(int a){
    int temp=a;
    int rem;
    int sum=0;
    if(a<=0){
        System.out.println("😤");
    }else{
        while(a>0){
        rem=a%10;
        a=a/10;
        sum=sum+ (int)Math.pow(rem,3);
    }
    if(temp==sum){
        System.out.println("yeah");
    }else{
        System.out.println("nope");
    }
    }
}
// 15. Sum of n numbers in java

// 16.  How to Print ASCII Value in Java
public static void ascii(char a,int x){
    System.out.println("Ascii "+a+"=>"+(int)a);
    System.out.println("value "+x+"=>"+(char)x);

}
// 17. Java Program to convert Number to Word
// 18. Find the large and small value in a array
   public static void minMax(int[] a) {
        int min = Arrays.stream(a).min().getAsInt();
        int max = Arrays.stream(a).max().getAsInt();

        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
// 19. Java Program to Check if a Given Number is Perfect Square
public static void perfectSquare(int a){

    double x=Math.sqrt(a);
    if(x==(int)x){
        System.out.println("yes");
        System.out.println(x+" "+(int)x);
    }
    else{
        System.out.println("no");
    }
}
// 20. Print leap year from 1900 to 2023
public static void leapYear(int a,int b){
    for(int i=a;i<=b;i++){
        if(i%4==0&&i%100!=0 || i%400==0){
            System.out.println(i);
        }
    }
}

    public static void main(String[] args) {
        System.out.println(fib(6));
        series(6);
        digitCount(1231234);
        isPalindrom(121);
        fact(5);
        isPrime(4);
        primeSeries(2, 10);
        swap(3, 5);
        words("hello it is fun day");
        primeSeries(2, 100);
        int[] a={1,3,5,2,8,44};
        larSmaNum(a);
        binaryAddition("11", "111");
        leapYear(1900, 2023);
        perfectSquare(121);
        int[] a1={1,2,3,6};
        minMax(a1);
        ascii('A',65);
        Armstrong(153);
        wordInStr("Have A fun time");
    }}