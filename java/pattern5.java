public class pattern5 {
    public static void main(String args[]) {
         
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");//print space
            }
            for(int k=i; k<=n; k++){//decreases space
                System.out.print("*");//print star
            }
            System.out.println("");
        }
        
    } //right sided triangle
    //increasing space 
    //decreses space
    
}
