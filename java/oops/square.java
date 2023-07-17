public class square {
    private int side;
    

    public  square(int side) {
        this.side = side;
        
    }
    public int getSide() {
        return side;
    }
    
    public int calculateArea() {
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }

    public static void main(String[] args){
        square Squ =new square(2);

        System.out.println(Squ.calculateArea());
        System.out.println(Squ.perimeter());
        
    }
}
