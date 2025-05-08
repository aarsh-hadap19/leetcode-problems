class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sr=s.toCharArray();
        char[] tr=t.toCharArray();
        Arrays.sort(sr);
        Arrays.sort(tr);
        return Arrays.equals(sr,tr);
    }
}