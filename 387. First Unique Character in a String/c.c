int firstUniqChar(char * s){
    int size = strlen(s);
    int * buffer = malloc(sizeof(int)*128);
    for(int i = 0; i < 128; i++){
        *(buffer+i) = 0;
    }
    for(int i = 0; i < size; i++){
        (*(buffer+*(s+i)))++;
    }
    for(int i = 0; i < 128; i++){
        if(*(buffer+i)>1){
            *(buffer+i) = 0;
        }
    }
    for(int i = 0; i < size; i++){
        if((*(buffer+*(s+i))) == 1){
            return i;
        }
    }
    return -1;
}
