 public class prime_N{
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
  public static void main(String args[]){
       primeSeries(2, 100);

  }
 }