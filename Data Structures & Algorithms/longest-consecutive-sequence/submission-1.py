class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # nums = [2,20,4,10,3,4,5]
        if len(nums) == 0:
            return 0
        
        # List lookup — O(n) linear search A list checks elements 
        # one by one from the start until it finds a match:
        # Set lookup — O(1) hash-based search A set uses a hash 
        # table, so it can jump directly to where the value would be:
        # convert the list into a set fot O(1) lookups:
        numSet = set(nums) 
        longest = 0

        for num in numSet:
            if (num - 1) not in numSet:
                # num is found as the start of a sequence and the length is 1
                sequenceLen = 1
                # sequenceLen is doing double duty — it's both 
                # the count and the offset to check the next number.
                while (num + sequenceLen) in numSet:
                    sequenceLen += 1
                longest = max(sequenceLen, longest)
        
        return longest
            



# numbers = [1, 2, 2, 3, 1, 4, 2]
# my_dict = {}

# for num in numbers:
#     # If num isn't in dict, get() returns 0. Then we add 1.
#     my_dict[num] = my_dict.get(num, 0) + 1

# print(my_dict)
# Output: {1: 2, 2: 3, 3: 1, 4: 1}


