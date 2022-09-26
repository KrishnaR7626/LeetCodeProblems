class Solution {
    public int[] runningSum(int[] nums) {
        int i = 0;
        int sum = 0;
        int ret [] = new int [nums.length];
        while(i<nums.length){
            sum+=nums[i];
            ret[i] = sum;
            i+=1;
        }

        return ret;
    }
}
