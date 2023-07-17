public class num_pattern2 {
    public static void main(String[] args) {
        int n = 5; // number of lines to print
        
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++){//decreasing right angle triangle pattern
                System.out.print( j +" ");
            }
            System.out.println("");
        }
    }
    
    
}
