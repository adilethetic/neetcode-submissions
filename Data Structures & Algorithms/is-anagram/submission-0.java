class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c) + 1);
            }else{
                map1.put(c, 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char c = t.charAt(i);
            if(map2.containsKey(c)){
                map2.put(c, map2.get(c) + 1);
            }else{
                map2.put(c, 1);
            }
        }

        for(char c: map1.keySet()){
            
            int count1 = map1.get(c);
            int count2 = map2.getOrDefault(c, 0);
            
            if(count1 != count2){
                return false;
            }
        

        }

        return true;

    }
}
