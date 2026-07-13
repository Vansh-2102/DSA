class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();
        char c = s.charAt(0);
        st.push(c);

        for (int i = 1; i < s.length(); i++) {
            c = s.charAt(i);

            if (!st.isEmpty() && c == st.peek()) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        String r = "";
        while (!st.isEmpty()) {
            r += st.peek();
            st.pop();
        }

        String t = "";

        for (int i = 0; i < r.length(); i++) {

            t= r.charAt(i) + t;
        }

        return t;

    }
}