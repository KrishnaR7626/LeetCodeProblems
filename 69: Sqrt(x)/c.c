int mySqrt(int x){
    if(x == 0 || x == 1){
        return x;
    }
    long int i = 1;
    while(i < x){
        if(((i+1) * (i+1) > x) || (i * i == x)) {
            return (int)i;
        }
        i+=1;    
    }
    return 0;
}
