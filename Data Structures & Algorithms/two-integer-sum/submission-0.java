class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> newMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int difference = target - num;

            // if the diff in the map, return the indexes
            if (newMap.containsKey(difference)){
                // put newMap.get(dofference) at first as putting 
                // the smaller index first
                return new int[]{newMap.get(difference), i};
            }
            newMap.put(num, i);
        }
        return new int[] {};

    }
}
