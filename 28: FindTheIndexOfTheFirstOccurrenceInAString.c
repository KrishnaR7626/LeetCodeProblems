int strStr(char * haystack, char * needle){
    int index = -1;
    for(int i = 0; i<strlen(haystack); i++){
        if(haystack[i] == needle[0]){
            index = i;
            for(int y = 0; y< strlen(needle); y++){
                if(!((strlen(haystack)>i+y) && haystack[i+y] == needle[y])){
                    index = -1;
                    break;
                }
            }
            if(index>-1){
                return index;
            }
        }
    }
    return index;
}
