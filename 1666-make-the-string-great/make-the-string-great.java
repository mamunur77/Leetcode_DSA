class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!st.isEmpty()) {

                char top = st.peek();

                if (top == ch + 32 || top == ch - 32) {
                    st.pop();
                    continue;
                }
            }

            st.push(ch);
        }

        String ans = "";

        for (int i = 0; i < st.size(); i++) {
            ans = ans + st.get(i);
        }

        return ans;
    }
}