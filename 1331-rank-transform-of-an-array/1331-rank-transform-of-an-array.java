class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] rank=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rank[i]=arr[i];
        }
        Arrays.sort(rank);
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int i=0;i<rank.length;i++){
            if(!map.containsKey(rank[i])){
                map.put(rank[i],r);
                r++;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;

        
    }
}