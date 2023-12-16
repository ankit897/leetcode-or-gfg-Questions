class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> mp1 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }
            else{
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
        }
        for(int i =0;i<t.length();i++){
            if(!mp1.containsKey(t.charAt(i))){
                mp1.put(t.charAt(i),1);
            }
            else{
                mp1.put(t.charAt(i),mp1.get(t.charAt(i))+1);
            }
        }
        if(mp.equals(mp1)){
            return true;
        }
        return false;
    }
}