class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer> st = new Stack<>();
        int [] a = new int[nums.length];

        // int c = nums[nums.length-1];
        // a[nums.length-1]= -1;
        // st.push(c);

        for(int i =2*n-1;i>=0;i--){
            // c=nums[i];
            
            while(!st.isEmpty()  &&  st.peek() <= nums[i%n]){
                      st.pop();
            }
            
            if(i<n){
               if(st.isEmpty())
                a[i] = -1;
                else
                a[i]=st.peek();
            }
             st.push(nums[i%n]);
            
        }

         return a;
    }

}
