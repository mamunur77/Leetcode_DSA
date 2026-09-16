class Solution {
    public String toGoatLatin(String sentence) {
        String latin ="";
        String vol = "aeiouAEIOU";
        String sent[]=sentence.split(" ");
        for(int i =0 ; i < sent.length; i++){
            char ch = sent[i].charAt(0);
            String a = "";
            for (int j = 0; j <= i; j++) {
                a = a + "a";
            }

            if( vol.indexOf(ch) == -1){
                latin = latin + sent[i].substring(1)+ch + "ma" + a + " ";
            }else{
                latin = latin+sent[i]+ "ma" + a + " ";
            }
        }
        return latin.trim();
    }
}