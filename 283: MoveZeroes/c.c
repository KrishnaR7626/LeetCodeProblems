void moveZeroes(int* nums, int numsSize){
    int ptr1 = 0;
    int ptr2 = 0;
    for(int i = 0; i < numsSize; i++){
        if(nums[i] == 0){
            ptr2++;
        }else{
            nums[ptr1] = nums[ptr2];
            ptr1++;
            ptr2++;
        }
    }
    for(; ptr1!=ptr2; ptr1++){
        nums[ptr1] = 0;
    }

}
