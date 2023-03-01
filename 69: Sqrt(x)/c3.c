int mySqrt(int x){
    int l = 0;
    int h = x;
    long mid;
    long res;
    while(l<=h){
        mid = (l+h)/2;
        res = mid*mid;
        if(res < x){
            l = mid+1;
        }else if(res > x){
            h = mid-1;
        }else{
            return mid;
        }
    }
    return h;
    
}
