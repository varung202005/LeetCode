class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        List<Integer> result=new ArrayList<>();
        int minLen = String.valueOf(low).length();
        int maxLen = String.valueOf(high).length();
        for(int i=minLen;i<=maxLen;i++){
            for(int j=0;j<=9-i;j++){
                String sub=s.substring(j,j+i);
                int num=Integer.parseInt(sub);
                if(num>=low && num<=high){
                    result.add(num);
                }
            }
        }
        return result;
    }
}