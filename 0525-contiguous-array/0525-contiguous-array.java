class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0,one=0,res=0;
        HashMap<Integer,Integer> f= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }

            int dif=zero-one;
            if(dif==0)
             {
                res=Math.max(res,i+1);
                continue;
             }
             
             if (!f.containsKey(dif)){
                f.put(dif,i);
             }else{
                int indx=f.get(dif);
                int len=i-indx;
                res=Math.max(res,len);
             }
        }
        return res;
    }
}