import java.util.*;

public class Karatsuba {
    public static void main(String s[]) {
        Scanner sw = new Scanner(System.in);
        long x = sw.nextLong();
        long y = sw.nextLong();
        System.out.println(k(x, y));
    }

    static long k(long x, long y) {
        if (x < 10 && y < 10) {
            return x * y;
        }
        long n = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
        long n1 = n / 2;
        long a = x / (long) Math.pow(10, n1);
        long b = x % (long) Math.pow(10, n1);
        long c = y / (long) Math.pow(10, n1);
        long d = y % (long) Math.pow(10, n1);
        long s1 = k(a, c);
        long s2 = k(b, d);
        long s3 = k(a + b, c + d);
        long s4 = s3 - s2 - s1;
        long res = s1 * (long) Math.pow(10, 2 * n1) + s4 * (long) Math.pow(10, n1) + s2;
        return res;
    }
}
