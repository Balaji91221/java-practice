public class number_pattern {
    public static void main(String[] args) {
        int n = 5; // number of lines to print
        
        int num = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            
            if (i % 2 == 0) {
                num = 1;
            } else {
                num = 2;
            }
            System.out.println("");
        }
    }
}