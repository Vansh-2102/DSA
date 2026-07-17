class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");

        for (String dir : parts) {

            if (dir.equals("") || dir.equals(".")) {
                continue;
            }

            if (dir.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(dir);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (String dir : st) {
            ans.append("/").append(dir);
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}