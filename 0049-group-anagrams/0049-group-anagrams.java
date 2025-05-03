class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for(String word:strs){
            char[]c=word.toCharArray();
            Arrays.sort(c);
            String sort=new String(c);
            if(!map.containsKey(sort)){
                map.put(sort,new ArrayList<>());
            }
            map.get(sort).add(word);
        }
        return new ArrayList<>(map.values());
    }
}