class Solution:
    def numberOfSteps(self, num: int) -> int:
        count = num
        steps = 0
        while count != 0:
            if (count & 1)  == 0:
                count>>=1
            else:
                count-=1
            steps+=1
        return steps
