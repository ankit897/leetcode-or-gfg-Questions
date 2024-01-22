class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        Arrays.sort(nums);
        HashSet<Integer> st = new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i =1;i<=nums.length;i++){
            if(!st.contains(i)){
                res[1] = i;
            }
        }
        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                res[0] = nums[i];
            }
        }
        return res;
    }
}