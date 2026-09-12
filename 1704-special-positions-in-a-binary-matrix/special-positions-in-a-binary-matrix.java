class Solution {
    public int numSpecial(int[][] mat) {
        int count =0;

        int[] rowcount = new int[mat.length];
        int[] colcount = new int[mat[0].length];

        
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                if (mat[r][c] ==1) {
                    rowcount[r]++; 
                    colcount[c]++; 
                }
            }
        }




        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1 && rowcount[i]==1 && colcount[j] == 1 || mat[i][j] == 1 && rowcount[i]==1 && colcount[j] == 1  ){
                    count++;
                }
            }
        }
        return count;


        




    }
}