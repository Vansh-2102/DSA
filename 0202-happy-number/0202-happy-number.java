class Solution {

    public int findsum(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=n;

        while(fast!=1){
            slow=findsum(slow);
            fast=findsum(fast);
            fast=findsum(fast);
             
             if(slow==fast && slow !=1){
                return false;
             }
        }
        return true;
    }
}