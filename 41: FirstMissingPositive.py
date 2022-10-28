class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        s = {i for i in nums}
        for i in range(1,len(nums)+1):
            if i not in s:
                return i
        return len(nums)+1
