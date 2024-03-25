import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Take an ArrayList to store the output
        List<Integer> resultSet = new ArrayList<>();
        
        // Traverse the input array
        for (int i = 0; i < nums.length; i++) {
            // Find the index by subtracting 1
            int index = Math.abs(nums[i]) - 1;
            
            // If the number at the calculated index is negative, it means it has been encountered before
            // Add the corresponding number (index + 1) to the resultSet
            if (nums[index] < 0)
                resultSet.add(index + 1);
            
            // Mark the number at the calculated index as visited by negating it
            nums[index] = nums[index] * -1;
        }
        
        // Return the resultSet containing all the duplicate numbers found in the input array
        return resultSet;
    }
}

//Time - O(N)
//Space - O(1) 