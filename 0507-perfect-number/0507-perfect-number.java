class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int val=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0) val+=i;
        }
        return val==num;
    }
}