class Solution {
    public void sortColors(int[] nums) {
        int [] c = new int [3];

        for(int i = 0; i < nums.length; i++){
            c[nums[i]]++;
        }
        int p = 0;
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i]; j++){
                nums[p] = i;
                p++;
            }
        }
    }
}
