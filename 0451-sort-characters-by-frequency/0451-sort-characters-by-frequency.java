class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> sortedChars = new ArrayList<>(map.keySet());
        Collections.sort(sortedChars, (a, b) -> map.get(b) - map.get(a));
        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            result.append(String.valueOf(c).repeat(map.get(c)));
        }
        return result.toString();
    }
}