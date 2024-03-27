class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t
       
        while (i < s.length() && j < t.length()) {
            // If characters match, move both the pointers to the next characters
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            // else Move j pointer to the next character in t(2nd string) regardless
            j++;
        }
       
        // If sPointer reached the end of s, then all characters in s(1st string) are found in t(2nd string)
        if(i == s.length())
        {
        return true;
        }
        else return false;
    }
 }
 // Time - O(n) -> where n is the length of the longest string
 //Space - O(1)
 