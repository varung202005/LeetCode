class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i!=(nums.length-1)/2)
            if(nums[i]==nums[(nums.length-1)/2]){
                return false;
            }
        }
        return true;
    }
}