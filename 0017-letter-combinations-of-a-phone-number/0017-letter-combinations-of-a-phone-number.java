class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return ans;
        }
        Map<Character,String>phone=new HashMap<>();
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");
        mapphone(0,digits,phone,ans,new StringBuilder());
        return ans;
    }
    private void mapphone(int ind,String digits,Map<Character,String>map,List<String>ans,StringBuilder builder){
        if(ind==digits.length()){
            ans.add(builder.toString());
            return;
        }
        String letters=map.get(digits.charAt(ind));
        for(char letter:letters.toCharArray()){
            builder.append(letter);
            mapphone(ind+1,digits,map,ans,builder);
            builder.deleteCharAt(builder.length()-1);
        }
    }
}