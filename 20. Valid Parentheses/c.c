bool isValid(char * s){
    int len = strlen(s);
    char * stack = malloc(sizeof(char)*len);
    int stackptr = 0;
    for(int i = 0; i < len; i++){
        if(*(s+i) == '}' || *(s+i) == ')'  || *(s+i) == ']'){
            if(stackptr == 0){
                return false;
            }
            if((*(s+i) == '}' && *(stack+stackptr-1) == '{') 
            || (*(s+i) == ')' && *(stack+stackptr-1) == '(')
            || (*(s+i) == ']' && *(stack+stackptr-1) == '[')){
                *(stack+stackptr) = NULL;
            }else{
                return false;
            }
            stackptr--;
        }else{
            *(stack+stackptr) = *(s+i);
            stackptr++;
        }
    }
    if(stackptr >0){
        return false;
    }else{
        return true;
    }
}
