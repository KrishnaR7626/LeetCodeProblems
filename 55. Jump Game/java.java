class Solution {
    public boolean canJump(int[] nums) {
        int count = 1;
        for(int i = 0; i< nums.length; i++){
            if(count == 0){
                return false;
            }
            count--;
            if(nums[i] > count){
                count= nums[i];
            }
        }
        return true; 
    }
}
