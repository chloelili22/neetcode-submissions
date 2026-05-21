class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
# nums = [-1,0,1,2,-1,-4]
# sort: nums = [-4,-1,-1,0,1,2]
        for i in range(len(nums)):
            # skip duplicate nums[i] since it will get duplicate pairs j, k
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue

            left, right = i + 1, len(nums) - 1

            while left < right:
                curSum = nums[left] + nums[right]
                if curSum > -nums[i]:
                    right -= 1
                elif curSum < -nums[i]:
                    left += 1
                else:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while nums[left] == nums[left - 1] and left < right:
                        left += 1
            
        return result

