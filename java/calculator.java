import java.util.Scanner;
public class calculator {
    public static void main(String args[]) {
        int n1 ,n2,ch ;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Select Operation: ");
        ch=sc.nextInt();

        if(ch==1){
            System.out.println("Addition" + (n1+n2));
        }
        else if(ch==2){
            System.out.println(" Subtraction" + (n1-n2));
        }
        else if(ch==3){
            System.out.println("multiplication" + n1*n2);
        }
        else if(ch==4){
            System.out.println("divide" + (n1/n2));

            
        }
     
        else{
            System.out.println("Invalid Operation");
        }


        
    }
    
}
