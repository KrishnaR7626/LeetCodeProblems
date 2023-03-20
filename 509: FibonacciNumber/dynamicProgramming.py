class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        a = 1
        b = 1
        t = 0
        x = 2
        if n == 0 or n == 1:
            return n
        while x<=n:
            t = b
            b = t+a
            a = t
            x+=1
        return t
