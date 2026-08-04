class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> map=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(!map.contains(i)){
                res.add(i);
            }
        }    
        
        return res;
    }
}