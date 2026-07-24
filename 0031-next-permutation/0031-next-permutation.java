class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=nums[0];
        int t=-1;
        int x=0;
        for(int i=nums.length-1;i>=1;i--){
        if(nums[i-1]<nums[i]){
            pivot=nums[i-1];
            t=i-1;
            break;
         }
}
        if(t==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int j=nums.length-1;j>t;j--){
            if(pivot<nums[j]){
            int run=nums[j];
            x=j;
            break;
        }
            }

        int temp=nums[t];
        nums[t]=nums[x];
        nums[x]=temp;

        reverse(nums,t+1,nums.length-1);
}
    public void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
            }
}