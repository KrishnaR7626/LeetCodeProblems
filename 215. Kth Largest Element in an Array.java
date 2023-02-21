class Solution {
    public int findKthLargest(int[] nums, int k) {
        int [] c = new int[20001];
        for(int i = 0; i < nums.length; i++){
            c[nums[i]+10000]++;
        }
        int p = 0;
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i]; j++){
                nums[p] = i-10000;
                p++;
            }
        }
        return nums[nums.length-k];
    }
}
