// Time Complexity : O(n) where n is the total numbers
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Coming up with the formula
/* Your code here along with comments explaining your approach: You can derive the formulae to calculate the sum of the products of the subset 
mathematically. Display the result after calculation. Add 1 and -1 in the derivation and take common is the main idea.
*/
class Solution{
    public SubsetProduct(int[] nums){
        int result = 0;
        for(int i  =0 ; i < nums.length; i++){
            result = result *  (1 + nums[i]);                                           // (1 + a) (1+b)(1+c).....(1+n) - 1 is formula
        }
        return result - 1;
    }
}