class Solution {
    public String reverseWords(String s) {
        String s3 ="";
        String [] s1 = s.split(" ");
        for(int i =0;i<s1.length;i++){
            s3+=reverse(s1[i])+" ";
        }
        return s3.trim();
    }
    public String reverse(String s){
        String s2 ="";
        for(int i = s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        return s2;
    }
}