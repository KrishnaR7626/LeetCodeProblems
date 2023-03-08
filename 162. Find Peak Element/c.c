int findPeakElement(int* nums, int numsSize){
    int l = 0; numsSize--; int mid = 0;
    while(l<numsSize){
        mid = (l+numsSize)/2;
        if(*(nums+mid+1) < *(nums+mid)) {numsSize=mid;}    
        else{l=mid+1;}
    }
    return l;
}
