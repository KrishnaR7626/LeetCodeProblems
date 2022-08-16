class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lrow = 0;
        int hrow = matrix.length-1;
        int n = matrix[0].length-1;
        while(lrow <= hrow){
            int mid  = (lrow+hrow)/2;
            if(matrix[mid][0] < target && matrix[mid][n] < target){
                lrow = mid+1;
            }else if(matrix[mid][0] > target && matrix[mid][n] > target){
                hrow = mid-1;              
            }else{
                int l = 0;
                int r = n;
                while(l<=r){
                    int midd = (r+l)/2;
                    if(matrix[mid][midd] == target){
                        return true;
                    }
                    if(matrix[mid][midd] < target){
                        l = midd+1;
                    }else{
                        r = midd-1;                        
                    }
                }
                return false;
            }
        }
    return false;
    }
}
