class Solution {
    public int search(int[] nums, int target) {
        // binary search: used to find the position of a target value within a sorted
        // array. Repeatedly diving the search interbal in half until the target value
        // or the interval is empty. 

        /*
        Input: nums = [-1,0,2,4,6,8], target = 4

        Output: 3
        [-1,0,2,4,6,8]
          l         r --> mid 
              mid

        */
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2; // instead of using (r-l) / 2 because  l+(r-l)/2 is 
            // safer because it prevents overflow in edge cases with large l and r values.
            /*
            r - l: This calculates the difference between r and l, which gives the distance 
            between the two indices. This avoids adding two large numbers.
            (r - l) / 2: This gives half of the distance between l and r, which is essentially 
            the middle point relative to l.
            l + (r - l) / 2: Finally, adding l to the result shifts the middle point back to 
            the correct position in the array or range.
            */
            if(nums[mid] > target) {
                r = mid - 1;
            }
            else if(nums[mid] < target) {
                l = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
