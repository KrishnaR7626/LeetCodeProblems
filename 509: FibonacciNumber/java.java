class Solution {
    public int fib(int n) {
        int [] d = new int[n];
        return fiba(n,d);
    }
    public int fiba(int n, int [] d){
        if(n == 0 || n ==1){
            return n;
        }else{
            if(d[n-1]== 0){                
                d[n-1] = fiba(n-1,d);
            }
            if(d[n-2]== 0){
                d[n-2] = fiba(n-2,d);
            }
            return d[n-2]+d[n-1];
        }
        
    }
}
