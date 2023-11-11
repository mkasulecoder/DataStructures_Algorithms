class Solution(object):

    @staticmethod
    def merge(nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """

        numList = []

        for num in nums1:
            if(num > 0):
                numList.append(num)

        for num in nums2:
            if num > 0:
                numList.append(num)

        numList.sort()

        print(numList)

nums1 = [ 1, 2, 3 , 0, 0, 0]
nums2 = [ 2, 5, 6 ]
Solution.merge(nums1,3,nums2,3)
