//Find the maximum vowels in a array of given length
class Solution {
    public int maxVowels(String s, int k) {
    int maxVowels = 0;
    int windowVowels = 0;
    //to store the values for comparing them in o(1) time
    Set<Character> vowels = new HashSet<>();
    vowels.add('a'); vowels.add('e'); vowels.add('i');
    vowels.add('o'); vowels.add('u');

    // Count the number of vowels in the first window
    for (int i = 0; i < k; i++)
      if (vowels.contains(s.charAt(i)))
        windowVowels++;

    maxVowels = windowVowels;

    // Slide the window and update the maximum number of vowels
    //if the removed element is vowel then increase it or decrease windowVowels 
    for (int i = k; i < s.length(); i++) {
      if (vowels.contains(s.charAt(i - k)))
        windowVowels--;

      if (vowels.contains(s.charAt(i)))
        windowVowels++;

      maxVowels = Math.max(maxVowels, windowVowels);
    }

    return maxVowels;
    }
}

//Time - O(n)
//Space - O(1) -> HashSet is used to store vowels at constant search time 

