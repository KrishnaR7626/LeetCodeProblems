class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        ptl, ptr  = 0, len(numbers)-1
        while ptl<ptr:
            if numbers[ptr]+numbers[ptl] == target:
                return [ptl+1, ptr+1]
            elif numbers[ptl]+numbers[ptr] < target:
                ptl+=1
            else:
                ptr-=1        
        return [ptl +1, ptr+1]
