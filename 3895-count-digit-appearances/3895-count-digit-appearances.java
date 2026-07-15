class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                int n=nums[i]%10;
                nums[i]=nums[i]/10;
                if(n==digit){
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        return count;
        
    }
}