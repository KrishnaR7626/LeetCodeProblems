int majorityElement(int* nums, int numsSize){
    int candidate = *nums;
    int count  = 1;
    for(int i = 1; i < numsSize; i++){
        if(*(nums+i) == candidate){
            count++;
        }else{
            count--;
            if(count == 0){
                candidate = *(nums+i);
                count++;
            }
        }
    }
    return candidate;
}
