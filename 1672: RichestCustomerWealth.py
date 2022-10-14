class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max = 0
        for customer in accounts:
            sum = 0
            for bank in customer:
                sum+=bank
            if sum > max:
                max = sum
        return max
