class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        if(len(nums) == 1):
            return nums[0]

        i = 1
        while i < len(nums):
            if not nums[i] == nums[i-1]:
                return nums[i-1]
            i+=2
        return nums[len(nums)-1]
        
