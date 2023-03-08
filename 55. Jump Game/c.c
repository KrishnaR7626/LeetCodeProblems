bool canJump(int* nums, int numsSize){
    int count = 1;
    for(int i = 0; i< numsSize; i++){
        if(count == 0){ return false; }
        count--;
        if(*(nums+i) > count){ count= *(nums+i);}
    }
    return true; 
}
