class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res=arr[0];

        for(int i=1; i< arr.length; i++){
            int prenodelete=nodelete;
            int preonedelete = onedelete;
            nodelete=Math.max(nodelete+arr[i], arr[i]);
            int v=0;
            if(preonedelete == Integer.MIN_VALUE){
                v=arr[i];
            }else {
                v=preonedelete+arr[i];
            }

            onedelete = Math.max(v, prenodelete);
            res=Math.max(res, Math.max(onedelete, nodelete));
        }

        return res;
    }
}