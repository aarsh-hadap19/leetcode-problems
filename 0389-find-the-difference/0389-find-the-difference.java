import java.util.HashMap;

class Solution {
    public char findTheDifference(String s, String t) {
        // Create a HashMap to count characters
        HashMap<Character, Integer> hashmap = new HashMap<>();

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }

        // Subtract counts for the second string
        for (char c : t.toCharArray()) {
            if (hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c) - 1);
            } else {
                return c; // This is the extra character
            }
        }

        // Find the character that has a count of -1
        for (char c : hashmap.keySet()) {
            if (hashmap.get(c) == -1) {
                return c; // Return the extra character
            }
        }

        return '\0'; // Should never reach here if input is valid
    }
}
