class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index = s.length() - 1;
        
        // Skip trailing spaces
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
        
        // Count the length of the last word
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }
        
        return length;
    }
}
