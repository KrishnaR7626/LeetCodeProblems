class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sum = 0
        for i in nums:
            sum+=i
        currentsum = 0
        for i in range(len(nums)):
            if (sum-nums[i])/2 == currentsum:
                return i
            currentsum+=nums[i]
        return -1
