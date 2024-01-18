class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int i =0;
        int j =0;
        int max =0;
        int res =0;
        while(j<s.length()){
            freq[s.charAt(j)-'A']++;
            max = Math.max(max,freq[s.charAt(j)-'A']);
            if(j-i+1-max>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}