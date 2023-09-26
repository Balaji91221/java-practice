import java.util.*;

public class ToggleSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Switch Count");
        int n = sc.nextInt();
        boolean switchs[] = new boolean[n + 1];
        int oncount = 0;
        int ofcount = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if (switchs[j] == false)
                    switchs[j] = true;
                else
                    switchs[j] = false;
            }
        }
        for (int k = 1; k <= n; k++) {
            if (switchs[k] == true)
                oncount = oncount + 1;
            else
                ofcount = ofcount + 1;
        }
        System.out.println("On count " + oncount);
        System.out.println("Off Count " + ofcount);
    }
}
