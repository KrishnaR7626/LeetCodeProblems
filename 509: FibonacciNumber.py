#https://leetcode.com/problems/fibonacci-number/submissions/
class Solution(object):
    def fib(self, n):# arg: int, return: int
#       if n > 2 recursively call and findout the value of last 2 elements.
        if n >= 2:
            return self.fib(n-1) + self.fib(n-2)
#       if n == 1 or 0 return 1 or 0
        return n

