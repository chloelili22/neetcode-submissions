class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # "abczabi"
        dupChar = set()
        length = 0
        l = 0
        
        for r in range(len(s)):
            while s[r] in dupChar:
                dupChar.remove(s[l])
                l += 1
            dupChar.add(s[r])
            length = max(length, r - l + 1)
        return length
