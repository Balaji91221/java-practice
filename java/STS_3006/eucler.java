
import java.util.Scanner;

public class eucler {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //int phi=n;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    System.out.println(n+" "+i);
                    n = n / i;
                }
                //phi=phi*(i-1)/i;
            }
            //System.out.println(phi);
        }
    }
}
