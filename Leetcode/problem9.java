

public class problem9 { // Palindrome number in LeetCode
     static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
       if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 12321;
        int y = 123321;
        int z = 123421;
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(y));
        System.out.println(isPalindrome(z));
    }
}

// Output:  true                            
//          true
//          false
// Time Complexity: O(n) where n is the number of digits in the input number.
// Space Complexity: O(1) since no extra space is used.
//formula: reverse = reverse * 10 + lastDigit;
//         temp /= 10;
//         lastDigit = temp % 10;   
// how it works:
// 1. We take the input number and store it in a variable temp.
// 2. We then initialize another variable rev to 0. This variable will store the reverse of the input number.
// 3. We loop until temp becomes 0.
// 4. In each iteration, we first find the last digit of the number temp by using the modulus operator %.
// 5. We then add this digit to the variable rev after multiplying it by 10.
// 6. Finally, we divide the number temp by 10 to remove the last digit from it.
// 7. After the loop terminates, the reverse of the input number will be stored in the variable rev.
// 8. We then compare the rev with the input number. If they are equal, the number is a palindrome. Otherwise, it is not a palindrome.
// 9. We return the result.
// 10. The time complexity of this solution is O(n) where n is the number of digits in the input number.
// 11. The space complexity