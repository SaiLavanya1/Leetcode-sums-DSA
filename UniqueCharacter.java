import java.util.HashMap;

public class UniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);   //adding the frequency of elements in a hashmap
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        UniqueCharacter solution = new UniqueCharacter();
        // Test cases
        String[] testCases = {"leetcode", "loveleetcode", "aabb"};
        for (String testCase : testCases) {
            int result = solution.firstUniqChar(testCase);
            System.out.println("First unique character index in \"" + testCase + "\": " + result);
        }
    }
}


//As per my understanding 
//Time - O(N) -> Traversed to put the characters in hashmap O(N) , finding index in lesser frequency in hashmap O(N) -> so tatal is O(N)
//Space - O(N) -> which we using hashmap but here we string is charcaters i.e., english alphabets so for hashmap the default and constant space is 26 so we can consider space as O(1)



//The Problem URL is https://leetcode.com/problems/first-unique-character-in-a-string/description/

