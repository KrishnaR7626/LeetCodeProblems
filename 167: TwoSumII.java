class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ptl = 0;
        int ptr = numbers.length-1;
        int r [] = {ptl+1, ptr+1};
        while(ptl<ptr){
            if(numbers[ptr]+numbers[ptl] == target){
                r [0] = ptl+1;
                r [1] = ptr+1;
                return r;
            }else if(numbers[ptr]+numbers[ptl] < target){
                ptl+=1;
            }else{
                ptr-=1;
            }
        }
    return r;
    }
}
