# https://leetcode.com/problems/sqrtx/
class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0 or x == 1:
            return x
        i = 1
        while i < x:
            if ((i+1) * (i+1) > x) or (i * i == x):
                return i 
            i+=1
