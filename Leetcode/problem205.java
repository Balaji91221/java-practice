import java.util.HashMap;

public class problem205 {
    public static void main(String[] args) {
        // LeetCode problem 205: Isomorphic Strings
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If the strings have different lengths, they can't be isomorphic
        }

        HashMap<Character, Character> map = new HashMap<>();// Map to store key-value pairs of characters

        for (int i = 0; i < s.length(); i++) {//
            char c1 = s.charAt(i); // Character at index i in string s
            char c2 = t.charAt(i); // Character at index i in string t

            if (map.containsKey(c1)) {// If the map already contains c1 as a key
                if (map.get(c1) != c2) {// If the value of c1 is not equal to c2
                    return false; // If the map contains c1 but the value is not equal to c2, strings are not isomorphic
                }
            } else {
                if (map.containsValue(c2)) {// If the map already contains c2 as a value
                    return false; // If the map already contains c2 as a value, strings are not isomorphic
                }
                map.put(c1, c2); // Put the key-value pair in the map
            }
        }

        return true; // All characters mapped correctly, strings are isomorphic
    }
}
