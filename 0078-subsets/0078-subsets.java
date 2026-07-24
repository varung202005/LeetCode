class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        backtrack(0,res,subset,nums);
        return subset;
    }
    public void backtrack(int index,List<Integer> res,List<List<Integer>> subset,int[] nums){
        if(index==nums.length){
            subset.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[index]);
        backtrack(index+1,res,subset,nums);
        res.remove(res.size()-1);
        backtrack(index+1,res,subset,nums);

    }
}