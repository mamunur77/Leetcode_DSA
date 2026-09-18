class Solution {
    public int countBinarySubstrings(String s) {
       int previous = 0;
        int current = 1;
        int answer = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } 
            else {
                if (previous < current) {
                    answer += previous;
                } 
                else {
                    answer += current;
                }

                previous = current;
                current = 1;
            }
        }

        if (previous < current) {
            answer += previous;
        } 
        else {
            answer += current;
        }

        return answer;
    }
    
}