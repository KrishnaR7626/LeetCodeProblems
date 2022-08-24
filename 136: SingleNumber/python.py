# https://leetcode.com/problems/single-number/
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #Sort the list to group all the double elements to gether
        nums.sort()
        #if there is only 1 element return it
        if(len(nums) == 1):
            return nums[0]
        i = 1
        #iterate through the loop
        while i < len(nums):
            #if the 2 elements next to each other are not the same return the different element.
            if not nums[i] == nums[i-1]:
                return nums[i-1]
            i+=2
        #return the last element.
        return nums[len(nums)-1]
        
