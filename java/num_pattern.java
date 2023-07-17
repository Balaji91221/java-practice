public class num_pattern {
    public static void main(String args[]){
        int n = 5; // number of lines to print
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){//right angle triangle pattern
                System.out.print( j +" ");
            }
            System.out.println("");
        }
    }
    
}
