public class pattern4 {
    public static void main(String args[]) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){ 
                System.out.print("  ");
            } //decresing
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            } 
            
            System.out.println(" ");
        }

        
    }
    
} //right sided triangle if any space is given it will be 
// in one loop we creating the  nested loops
