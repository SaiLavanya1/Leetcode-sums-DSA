public class RemoveVowels {
    // Private method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u';
    }
    
    // Method to remove vowels from a string
    public static String removeVowels(String s) {
        // Using StringBuffer to efficiently manipulate strings
        StringBuffer result = new StringBuffer();
        
        // Iterating through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // If the character is not a vowel, append it to the result
            if (!isVowel(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }
        
        // Convert StringBuffer to String and return
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "leetcode";
        String output = removeVowels(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}

//Time - O(N) -> traversed the string at once - O(N), and for each voewl call - O(1)
//Space - O(1) -> the new empty output string not considered as a extra space 
