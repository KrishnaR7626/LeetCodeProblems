class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int mid = 0;
        while(l<r){
            mid = (l+r)/2;
            if(nums[mid+1] < nums[mid]){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}
