public class Two_dimensional {
    public static void main(String[] args) {
        int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int b[][] = { { 1, 9, 4 }, { 3, 7, 6 }, { 0, 2, 4 } };

        System.out.println(calculateArraySum(a));
        addArray(a, b);
        int[][] squaredArray = squareArray(a);
        printArray(squaredArray);
        findCommonElements(a, b);
    }

    // Calculate the sum of all the elements of a two-dimensional array.
    public static int calculateArraySum(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        return sum;
    }

    // Add the elements of two arrays and print the result.
    public static void addArray(int[][] array1, int[][] array2) {
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            System.out.println("Arrays must have the same dimensions for addition.");
            return;
        }

        int[][] result = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Create the square matrix of size n*n and return it.
    public static int[][] squareArray(int[][] array) {
        int result[][] = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result[i][j] = array[i][j] * array[i][j];
            }
        }
        return result;
    }

    // Print the elements of a two-dimensional array.
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Find and print the common elements in two two-dimensional arrays.
    public static void findCommonElements(int[][] array1, int[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    for (int l = 0; l < array2[k].length; l++) {
                        if (array1[i][j] == array2[k][l]) {
                            System.out.print(array1[i][j] + " ");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(); // Print a new line after printing common elements
    }
}
