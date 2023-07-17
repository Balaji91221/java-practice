public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
         return length;
    }

    public int getWidth() {
        return width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);

        System.out.println("Length: " + rectangle.getLength()); // Output: 5
        System.out.println("Width: " + rectangle.getWidth()); // Output: 3
        System.out.println("Area: " + rectangle.calculateArea()); // Output: 15
        System.out.println("Perimeter: " + rectangle.calculatePerimeter()); // Output: 16
    }
}
