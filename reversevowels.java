public class reversevowels {
    // Return true if the character is a vowel (case-insensitive)
    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
            || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
    // Function to reverse vowels in a string
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();       //converting string to array(o(n) ->space , due to string is immutable)
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // Find the leftmost vowel
            while (start < end && !isVowel(chars[start])) {
                start++;
            }
            // Find the rightmost vowel
            while (start < end && !isVowel(chars[end])) {
                end--;
            }
            // Swap vowels
            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        // Convert char array back to String
        return new String(chars);
    }

    public static void main(String[] args) {
        reversevowels solution = new reversevowels();
        String input = "hello world";
        String reversed = solution.reverseVowels(input);
        System.out.println(reversed);
    }
}

//Time - O(N) -> tarversed every character in the array
//Space - O(N)-> converting string to char array
