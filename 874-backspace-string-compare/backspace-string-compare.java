class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                a.append(s.charAt(i));
            } else if (a.length() > 0) {
                a.deleteCharAt(a.length() - 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                b.append(t.charAt(i));
            } else if (b.length() > 0) {
                b.deleteCharAt(b.length() - 1);
            }
        }

        return a.toString().equals(b.toString());
    }
}