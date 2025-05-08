class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hashmap = new HashMap<Character, Integer>();
        char[] charArray = magazine.toCharArray();
        char[] charArray2 = ransomNote.toCharArray();
        for(char c:charArray){
            if(hashmap.containsKey(c)){
                hashmap.put(c,hashmap.get(c)+1);
            }
            else{
                hashmap.put(c,1);
            }
        }
        for(char c:charArray2){
            if(!hashmap.containsKey(c)||hashmap.get(c)==0){
                return false;
            }
            else{
                hashmap.put(c,hashmap.get(c)-1);
            }
        }
        return true;
    }
    
}