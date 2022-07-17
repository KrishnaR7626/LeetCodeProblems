class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        i = 1
        if x == 0:
            return 0
        if x == 1:
            return i
        while i < x:
            if (i+1) * (i+1) > x:
                return i 
            if i * i == x:
                return i
            else:
                i+=1
                
