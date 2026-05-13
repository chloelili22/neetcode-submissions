class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # nums = [1,   2,    4,     6]
        #     [2*4*6,1*4*6,1*2*6, 1*2*4 ]

        # rest = [1,   1,    1,     1]
        # prefix means: prtoducet of everything LEFT of current index
        # i = 0, 1, 2, 3
        # index 0 -> product LEFT = 1
        # index 1 -> product LEFT = 1
        # index 2 -> product LEFT = 2
        # index 3 -> product LEFT = 8 
        # rest = [1,1,2,8]
        # postfix means: product of everything RIGHT of current index
        # k = 3, 2, 1, 0
        # postfix = 1
        # index 3 -> product RIGHT = postfix * rest[3] = 8
        # postfix = 1 * 6 = 6
        # index 2 -> product RIGHT = postfix * rest[2] = 12
        # postfix = 6 * 4 = 24
        # index 1 -> prodyct RIGHT = postfix * rest[1] = 24
        # postfix = 24 * 2 = 48
        # index 1 -> prodyct RIGHT = postfix * rest[0] = 48
        # rest = [48,24,12,8]

        rest = [1] * len(nums)
        prefix = 1
        for i in range(len(nums)):
            rest[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for k in range(len(nums) - 1, -1, -1):
            rest[k] *= postfix 
            postfix *= nums[k]

        return rest
