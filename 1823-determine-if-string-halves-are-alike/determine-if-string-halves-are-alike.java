class Solution {
    public boolean halvesAreAlike(String s) {
      String str = s.toLowerCase();
      if(s.length()%2!=0){
          return false;
      }
      int count =0;
      int count1=0;
      for(int i=0;i<str.length()/2;i++){
          if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'){
              count++;
          }
      }
      for(int i=str.length()/2;i<str.length();i++){
          if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'){
              count1++;
          }
      }
      if(count==count1){
          return true;
      }
      return false;
    }
}