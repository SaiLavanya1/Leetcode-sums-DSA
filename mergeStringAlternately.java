class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}

//Time - O(m+n) -> m for word1, n for word2
//Space - O(1)

Two Pointer Solution:
class Solution {
    public String mergeAlternately(String word1, String word2) {
  int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i));
		i++;
            }
            if (j < n) {
                result.append(word2.charAt(j));
		j++
            }
        }

        return result.toString();
}
}
