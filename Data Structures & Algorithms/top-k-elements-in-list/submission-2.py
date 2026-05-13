class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        # bucket sort: count is key, list of num will be the value in freq
        freq = [[] for i in range(len(nums) + 1)]

        for i in nums:
            # value is the count, key is num
            count[i] = 1 + count.get(i, 0)
        for key, value in count.items():
            freq[value].append(key)
# { 1: 1; 2: 2; 3:1; 4:2}
        res = []
        # loop with reverse order: range(start, stop, step)
        for i in range(len(freq) - 1, 0, -1): 
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res
