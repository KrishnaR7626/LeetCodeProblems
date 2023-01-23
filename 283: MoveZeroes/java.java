class Solution {
    public void moveZeroes(int[] nums) {
        int ptr = 0;
        int zeroc = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroc+=1;
            }else{
                nums[ptr] = nums[i];
                ptr+=1;
            }
        }
        for(int i = (nums.length-zeroc); i< nums.length; i++){
            nums[i] = 0;
        }
        return;
    }
}
