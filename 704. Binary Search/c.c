int search(int* nums, int numsSize, int target){
    int l = 0;
    int r = numsSize-1;
    int mid;
    while(l<=r){
        mid = (l+r) / 2;
        if(target < *(nums+mid)){
            r = mid-1;
        }else if(target > *(nums+mid)){
            l = mid+1;
        }else{
            return mid;
        }
    }
    return -1;
}
