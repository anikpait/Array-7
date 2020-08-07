// Time Complexity : O(n) where n is the number of words
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: While you traverse the word, get the first occurance of word 1 and simmilarly get the
first occurance of word 2 as j. Always keep the minimum distance between i and j (occurance of word 1 and word 2) and display the min distance as
the result.
*/
class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        if(words == null || words.length == 0) return 0;
        int i = -1, j = -1, k = 0, min = Integer.MAX_VALUE;
        int n = words.length;
        while(k < n){
            if(words[k].equals(word1)){
                i = k;                                                                      // Occurance of word 1
            } else 
            if(words[k].equals(word2)){
                j = k;                                                                  // Occurance of word 2
            }
            if(i > -1  && j > -1)
                min = Math.min(min, Math.abs(i - j));                                                       // Keep the minimum distance as result
            k++;
        }
        return min;
    }
}