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
    int a = min;
    int b = max;
    while(min != 0){
        a = max % min;
        b = min;
        if(a < b){
            min = a;
            max = b;
        }else{
            max = a;
            min = b;
        }
    }
    return max;
}
