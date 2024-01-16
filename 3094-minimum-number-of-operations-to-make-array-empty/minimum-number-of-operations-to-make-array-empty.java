class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int val:nums){
            hs.add(val);
        }
        int count =0;
        for(int value: hs){
            if(mp.get(value)==1){
                return -1;
            }
            count+=(mp.get(value)+2)/3;
        }
        return count;
    }
}