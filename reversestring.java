class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

public class reversestring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input);
        System.out.println(new String(input)); 
    }
}



//Time - O(N)
//Space - O(1)