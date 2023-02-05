void reverseString(char* s, int sSize){
    int lp = 0;
    int rp = sSize-1;
    char temp;
    while(rp-lp >= 1){
        temp = *(s+lp);
        *(s+lp)=*(s+rp);
        *(s+rp)=temp; 
        rp--;
        lp++;
    }
}
