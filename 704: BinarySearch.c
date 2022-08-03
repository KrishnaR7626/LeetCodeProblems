int search(int* nums, int numsSize, int target){
    int left = 0;
    int right = numsSize-1;
    while(left<=right){
        int median = (right+left)/2;
        if(*(nums+median) == target){
            return median;
        }else if(*(nums+median) > target){
            right = median-1;
        }else{
            left = median+1;
        }        
    }
    return -1;
}
