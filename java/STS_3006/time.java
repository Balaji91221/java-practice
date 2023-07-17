// this is big o(n) times
class time {
    public static void printitems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < n; j++) {  //this place we have n+n times=2n  o(2n)=o(n)
            System.out.println(j);
    }
}

    public static void main(String[] args) {
        printitems(10);
        
    }
}
