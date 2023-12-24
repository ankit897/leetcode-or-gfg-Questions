class Solution {
    public int minOperations(String str) {
        int minoperation =0;
        int m =0;
        int n =0;
        String s = "";
        String s1 = "";
        for(int i =0;i<str.length();i++){
            if(i%2==0){
                s+='0';
                s1+='1';
            }
            else{
                s+='1';
                s1+='0';
            }
        }
        for(int i =0;i<str.length();i++){
            if(s.charAt(i)!=str.charAt(i)){
                m++;
            }
            if(s1.charAt(i)!=str.charAt(i)){
                n++;
            }
        }
        for(int i =0;i<str.length();i++){
            minoperation = Math.min(m,n);
        }
        return minoperation;
    }
}