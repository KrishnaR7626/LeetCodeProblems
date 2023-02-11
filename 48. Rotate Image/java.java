class Solution {
    public void rotate(int[][] matrix) {
        int [][] m = new int [matrix.length][matrix.length];
        int mp = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){

                m[i][j] = matrix[matrix.length-j-1][i];
            }        
            mp+=1;
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = m[i][j];
            }        
        }
    }
}
