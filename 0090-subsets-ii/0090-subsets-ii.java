class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subset=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,subset,res,0);
        return subset;
    }
    
    public void backtrack(int[] nums,List<List<Integer>> subset,List<Integer> res,int index){
        if(nums.length==index){
            if(!subset.contains(new ArrayList<>(res))){
            subset.add(new ArrayList<>(res));
            }
            return;
        }

        res.add(nums[index]);
        backtrack(nums,subset,res,index+1);
        res.remove(res.size()-1);
        backtrack(nums,subset,res,index+1);
    }
}