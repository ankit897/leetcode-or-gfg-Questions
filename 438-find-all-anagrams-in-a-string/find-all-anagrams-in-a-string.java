class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ar = new ArrayList<>();
        int k = p.length();
        int n = s.length();
        int l[] = new int[26];//to store frequency of characters
        int r[] = new int[26];
        for(char c: p.toCharArray()){
            l[c-'a']++;
        }
        int i =0;
        int j =0;
        while(j<n){
            r[s.charAt(j)-'a']++;
            if(j-i+1<k){
                j++;
            }
            else{
                if(Arrays.equals(l,r)){
                    ar.add(i);
                }
                r[s.charAt(i)-'a']--;
                i++;
                j++;
            }
        }
        return ar;
    }
}