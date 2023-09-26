import java.util.Scanner;
public class alice_apple {
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int avg = sum/n;
        int count = 0;
        for(int i=0;i<n;i++) {
            if(a[i] > avg) {
                count++;
            }
        }
        System.out.println(count);

    }
    
}
