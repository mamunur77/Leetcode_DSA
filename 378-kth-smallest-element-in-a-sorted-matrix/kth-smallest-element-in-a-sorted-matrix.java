class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int i = matrix.length;
        int j = matrix[0].length;

        int arr[] = new int[i*j];
        int index = 0;
        for(int n = 0; n< i; n++){
            for(int m = 0; m<j; m++){
                arr[index]=matrix[n][m];
                index++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}