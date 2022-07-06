#https://leetcode.com/problems/fibonacci-number/submissions/
class Solution(object):
    def fib(self, n):# arg: int, return: int
        if n >= 2:
            return self.fib(n-1) + self.fib(n-2)
        elif n == 1:
            return 1
        elif n == 0:
            return 0
