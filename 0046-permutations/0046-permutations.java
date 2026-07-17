class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> map=new ArrayList<>();
        int[] used=new int[nums.length];
        backtrack(map,ans,used,nums);
        return ans;

        
    }
    public void backtrack(List<Integer> map,List<List<Integer>> ans,int[] used,int[] nums){
        if(nums.length==map.size()){
            ans.add(new ArrayList<>(map));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(used[i]==0){
                map.add(nums[i]);
                used[i]=1;
                backtrack(map,ans,used,nums);
                used[i]=0;
                map.remove(map.size()-1);  
            }
        
            }
    }
}
