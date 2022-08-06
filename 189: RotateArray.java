class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1){
            return;
        }
        k=k%nums.length;
        int r [] = new int[nums.length];
        int i = 0;
        while(i<k){
            r[i] = nums[nums.length-k+i];
            i++;
        }
        while(i<nums.length){
            r[i] = nums[i-k];
            i++;
        }
        for(int p = 0; p < nums.length; p++){
            nums[p] = r[p];        
        }
    }
}
