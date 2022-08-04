class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ret = []
        for i,y in zip(nums, range(len(nums))):
            ret.append(i*i);
        ret.sort()
        return ret
