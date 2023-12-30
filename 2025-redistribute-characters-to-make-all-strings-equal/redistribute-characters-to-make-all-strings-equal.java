class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int freq[] = new int[26];
        String s ="";
        for(int i =0;i<words.length;i++){
            s+=words[i];
        }
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i =0;i<26;i++){
            if(freq[i]%n!=0){
                return false;
            }
        }
        return true;
    }
}