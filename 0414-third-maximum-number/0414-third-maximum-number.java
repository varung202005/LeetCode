class Solution {
    public int thirdMax(int[] nums) {
        // Arrays.sort(nums);
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for (int num : res) {
        arr[i] = num;
        i++;
            }

            Arrays.sort(arr);





        if(arr.length>=3){
            return arr[arr.length-3];
        }
        return arr[arr.length-1];
        
    }
}