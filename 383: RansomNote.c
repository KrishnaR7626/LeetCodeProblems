bool canConstruct(char * ransomNote, char * magazine){
    int * letters = malloc(sizeof(int)*128);
    for(int i=0; i< 128; i++){
        *(letters+i)=0;
    }
    for(int i=0; i< strlen(magazine); i++){
        *(letters+*(magazine+i))+=1;
    }
    for(int i=0; i< strlen(ransomNote); i++){
        if(*(letters+*(ransomNote+i)) == 0){
            return false;
        }else{
            *(letters+*(ransomNote+i))-=1;
        }
    }
    return true;
}
