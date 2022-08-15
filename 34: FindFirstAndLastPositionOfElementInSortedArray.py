class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        index1 = -1
        index2 = -1
        for i in range(len(nums)):
            if index1 > -1 and nums[i] == target:
                index2 = i
            elif nums[i] == target:
                index1 = i
                index2 = i
        return [index1,index2]
            
                
