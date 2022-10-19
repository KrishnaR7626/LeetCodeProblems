class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        int digits = 0;
        int current = 0;
        for(int i = 0; i < nums.length; i++){
            current = nums[i];
            while(current > 0){
                current /= 10;
                digits+=1;
            }          
            if(digits % 2 == 0){
                counter+=1;
            }
            digits = 0;
        }
        return counter;
    }
}
