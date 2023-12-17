class Solution {
    public boolean checkPossibility(int[] arr) {
        int n = arr.length;
        int pos = -1;
		 for(int i =0;i<n-1;i++){
			 if(arr[i]>arr[i+1]){
				 if(pos!=-1){
					 return false;
				 }
				 pos =i;
			 }
		 }
		 return pos==-1||pos==0||pos==arr.length-2||arr[pos-1]<=arr[pos+1]||arr[pos]<=arr[pos+2];
    }
}