class Solution {
    public int maxDistinct(String s) {
        int count=1;
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            char n=arr[i];
            if(n!=arr[i+1]){
                count++;
                continue;
            }
        }
        
        return count;
    }
}