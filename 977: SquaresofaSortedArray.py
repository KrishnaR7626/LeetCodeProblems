class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        sqrt = [i*i for i in nums]
        sqrt.sort()
        return sqrt
