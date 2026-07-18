class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(max<nums[i+1]){
                max=nums[i+1];
            }
            
        }
        for(int i=0;i<nums.length-1;i++){
            if(min>nums[i+1]){
                min=nums[i+1];
            }
            
        }

        while(max!=0){
            int temp=max;
            max=min%max;
            min=temp;
        }
        return min;


        
    }
}