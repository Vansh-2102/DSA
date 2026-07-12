class Solution {
    public void reverseString(char[] s) {

        Stack<Character> st = new Stack<>();
         for(int i=0;i<s.length;i++){
            char a=s[i];
            st.push(a);
         }
          int i=0;
         while(!st.isEmpty()){
            char b = st.peek();
            st.pop();
            s[i]=b;
            i++; 
         }
        
    }
}