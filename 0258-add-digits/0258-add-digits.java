class Solution {
    public int addDigits(int num) {
        int sum=0,a=0;
            while(num!=0){
                a=num%10;
                sum+=a;
                num=num/10;
            }
            int rum=sum;
            if(rum<10){
                return rum;
            }
            else{
                return addDigits(rum);
            }
        
        // return -1;
    }
    
}