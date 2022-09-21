

int maxPower(char * s){
    int length = strlen(s);
    int counter = 0;
    int max = 0;
    int current = 0;
    int i = 0;
    if(length == 1 || length == 0){
        return length;
    }
    while(i < length){
        if(s[i] == s[current]){
            counter+=1;
        }else{
            counter = 1;
            current = i;
        }
        if(max<counter){
            max = counter;
        }
        i+=1;
    }
    return max;
}
