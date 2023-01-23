class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        c = 0
        a = 0
        for i in range(len(nums)):
            if nums[i] == val:
                a+=1
            else:
                nums[c] = nums[a]
                c+=1
                a+=1
        for i in range(a-c):
            nums.pop()
