class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int [] newNums = new int[nums.length/2];
        for(int i = 0; i < newNums.length; i++){
            if(i % 2 == 0){
                newNums[i] = this.min(nums[2*i], nums[2*i+1]);
            }else{
                newNums[i] = this.max(nums[2*i], nums[2*i+1]);
            }
        }
        return minMaxGame(newNums);
    }
    public int min(int num1, int num2){
        return num1 < num2 ? num1: num2;
    }
    public int max(int num1, int num2){        
        return num1 > num2 ? num1: num2;
    }
}
