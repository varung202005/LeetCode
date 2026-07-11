class Solution {
    public void rotate(int[] nums, int k) {
        int[] res=new int[nums.length];
        if(k>nums.length){
            k=k%nums.length;
        }
        int a=Math.abs(nums.length-k);
        int i=0,b=0;
            
            while(a<nums.length){
            res[i]=nums[a];
            a++;
            i++;    
            }
            while(i<nums.length){
            res[i]=nums[b];
            i++;
            b++;
            }
            for(int j=0;j<nums.length;j++){
                nums[j]=res[j];
            
                }
            return;
    }
}