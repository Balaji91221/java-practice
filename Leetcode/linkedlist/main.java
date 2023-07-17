// 
import java.util.*;

class Trending{
    
    // 732 ==> t
    
    public static void trendingNum(int a){
        int x=a/10;
        int y=x%10;
        
        if(x/100<=0){
            if(y%3==0){
                System.out.println("Tre");
            }else{
                System.out.println("Not");
            }
        }else{
           // System.out.println("Not");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        
        trendingNum(x);
    }
}
