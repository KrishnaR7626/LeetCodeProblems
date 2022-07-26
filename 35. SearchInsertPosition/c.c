https://leetcode.com/problems/search-insert-position/

int searchInsert(int* nums, int numsSize, int target){
        int l = 0;
        while(l<numsSize){
            if(target <= *(nums+l)){
                return l;    
            }
            l++;
        }
        return l;
}
