void reverseString(char* s, int sSize){
    int rp = sSize-1;
    int lp = 0;
    char temp;
    while(lp < rp){
        temp = *(s+rp);
        s[rp] = *(s+lp);
        s[lp] = temp;
        rp--;
        lp++;
    }
    return;
}
