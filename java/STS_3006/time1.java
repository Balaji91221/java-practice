
//this is o(n2) time complexity
class time1{
    public static void printitems(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(i+" "+j);
    }
}
    }
    public static void main(String[] args){
        printitems(10);
    }
}
