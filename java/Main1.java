import java.util.Scanner;
 public class Main1 {
    public void haveFun() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public void triangle1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public void triangle2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

   public static void main(String[] args) {
        int x;
        do {
            System.out.println("Enter 1 to 4: ");
            Scanner sc = new Scanner(System.in);
            Main1 obj = new Main1();
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Its");
                    obj.haveFun();
                    break;
                case 2:
                    obj.triangle1();
                    break;
                case 3:
                    obj.triangle2();
                    break;
                case 4:
                    break;
            }
        } while (x != 4);
    }

    
}
