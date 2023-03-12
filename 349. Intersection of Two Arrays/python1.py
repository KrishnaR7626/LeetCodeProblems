class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        num = {i for i in nums1}
        res = {i for i in nums2 if i in num}
        r = [i for i in res]
        return r
