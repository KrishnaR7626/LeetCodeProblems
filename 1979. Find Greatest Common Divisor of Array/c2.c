int findGCD(int* nums, int numsSize){
    int min = *nums;
    int max = *nums;
    for(int i = 0; i < numsSize; i++){
        if(*(nums+i)>max){
            max = *(nums+i);
        }
        if(*(nums+i)<min){
            min = *(nums+i);
        }
    }
    int temp;
    while(min != 0){
        if(max % min < min){
            temp = min;
            min = max % min;
            max = temp;
        }else{
            temp = max;
            max = max % min;
            min = temp;
        }
    }
    return max;
}
