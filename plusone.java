public class plusone {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits; // Return here when we successfully increment a digit
            }
        }
        
        // If we reach here, it means all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        plusone solution = new plusone();
        
        // Test cases
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        printArray(result1); // Expected: [1, 2, 4]
        
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        printArray(result2); // Expected: [4, 3, 2, 2]
        
        int[] digits3 = {9, 9, 9};
        int[] result3 = solution.plusOne(digits3);
        printArray(result3); // Expected: [1, 0, 0, 0]
    }
    
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

//Time - O(N)
//Space - O(1)
