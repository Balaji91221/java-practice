public class datatype_range {
    public static void main(String args[]) {
        System.out.println("Byte range:");
        System.out.println("min: " + Byte.MIN_VALUE);
        System.out.println("max: " + Byte.MAX_VALUE);
        System.out.println("Short range:");
        System.out.println("min: " + Short.MIN_VALUE);
        System.out.println("max: " + Short.MAX_VALUE);
        System.out.println("Integer range:");
        System.out.println("min: " + Integer.MIN_VALUE);
        System.out.println("max: " + Integer.MAX_VALUE);
        System.out.println("Long range:");
        System.out.println("min: " + Long.MIN_VALUE);
        System.out.println("max: " + Long.MAX_VALUE);
        System.out.println("Float range:");
        System.out.println("min: " + Float.MIN_VALUE);
        System.out.println("max: " + Float.MAX_VALUE);
        System.out.println("Double range:");
        System.out.println("min: " + Double.MIN_VALUE);
        System.out.println("max: " + Double.MAX_VALUE);

        
    }
    
}
// datatype_range class is used to find the range of primitive data types in Java.
// The range of a data type is the maximum and minimum value that can be stored by the data type.
// The range of a data type is platform-dependent, i.e., it can vary from one operating system to another.
// The range of a data type depends on the number of bits used to represent the data type.
// The range of a data type is calculated as follows:
// 1. The minimum value of a data type is calculated as -2^(n-1) where n is the number of bits used to represent the data type.
// 2. The maximum value of a data type is calculated as 2^(n-1) - 1 where n is the number of bits used to represent the data type.
// 3. For example, the range of the byte data type is calculated as follows:
//    a. The number of bits used to represent the byte data type is 8.
//    b. The minimum value of the byte data type is calculated as -2^(8-1) = -2^7 = -128.
//    c. The maximum value of the byte data type is calculated as 2^(8-1) - 1 = 2^7 - 1 = 127.
// 4. The range of the byte data type is -128 to 127.
// 5. The range of the short data type is -32768 to 32767.
// 6. The range of the int data type is -2147483648 to 2147483647.
// 7. The range of the long data type is -9223372036854775808 to 9223372036854775807.
// 8. The range of the float data type is 1.4e-45 to 3.4e+38.
// 9. The range of the double data type is 4.9e-324 to 1.8e+308.
// 10. The range of the char data type is 0 to 65535.

