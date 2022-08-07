
char * reverseWord(char * s, int lp, int rp){
   char temp;
   while(lp<rp){
       temp = s[rp];
       s[rp] = s[lp];
       s[lp] = temp;
       lp++;
       rp--;
   }
    return s;
}
char * reverseWords(char * s){
    int max = strlen(s);
    int i = 0;
    int lp = 0;
    int rp = 0;
    while(i<max){
        if(s[i] == ' '){
            s = reverseWord(s, lp, rp-1);
            lp = i+1;
            rp = i+1;
        }else{
            rp+=1;
        }
        i++;   
    }
    s = reverseWord(s, lp, max-1);
    return s;
}
