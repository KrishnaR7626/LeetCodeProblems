class NumArray {
    int [] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
    int sum = 0;
    int i = left;
    while(i<=right){
        sum+=this.nums[i];
        i+=1;
    }
    return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */303. Range Sum Query - Immutable
