class Solution {
    public int climbStairs(int n) {
        int [] d = new int[n];
        return climbStair(n,d);
    }
    public int climbStair(int n, int [] d){
        if(n == 1 || n == 2){
            return n;
        }else{
            if(d[n-1] == 0){
               d[n-1] = climbStair(n-1,d); 
            }
            if(d[n-2] == 0){
               d[n-2] = climbStair(n-2,d); 
            }
            return d[n-1]+d[n-2];
        }
    }
}
