class Solution {
    public int maxProfit(int[] prices) {
        // using two pointers left and right, left is buy, right is sell
        int l = 0;
        int r = 1;
        int maxP = 0;
        // if right is greater than left, compare the max and the difference between right and left
        // if left is greater than right, left should be shifted to the position of right
        // we want the buy is at the lowest point

        while(r < prices.length){
            if(prices[l] < prices[r]) {
                maxP = Math.max(maxP, prices[r] - prices[l]);
            }
            else{
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
