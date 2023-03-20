int fib(int n){
    int a = 1;
    int b = 1;
    if(n < 2){
        return n;
    }
    n--;
    while(--n>0){
        b +=a;
        a = b-a;
    }
    return b;
}
