class Solution {
    public String reverseOnlyLetters(String s) {
        char sen [] = s.toCharArray();
        int left =0;
        int right = s.length() -1;
        while(left < right){
            if(!Character.isLetter(sen[left])){
                left++;
            }else if(!Character.isLetter(sen[right])){
                right--;
            }else{
                char temp = sen[left];
                sen[left] = sen[right];
                sen[right]= temp;

                left++;
                right--;
            }

        }
        return new String(sen);
    }
}