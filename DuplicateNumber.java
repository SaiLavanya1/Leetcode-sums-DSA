public class DuplicateNumber {
        public int findDuplicate(int[] nums) {
        // Start a fast and slow pointer
        // until they meet
        int slow = 0, fast = 0;
        do {
          slow = nums[slow];
          fast = nums[nums[fast]];
        } while (slow != fast);
    
        // As soon as they meet, move both
        // pointers at same speed until they
        // meet again
        slow = 0;
        while (slow != fast) {
          slow = nums[slow];
          fast = nums[fast];
        }
        return slow;
        }
    }
    //Time - O(N)
    //Space - O(1)
    

    //It forms like a linkedList in Visuals and whenever u get the same number then u need to link the next pointer to the same number already exist
    //We can do this is using sorting or Binary search or HashSet but the space is O(N)

     
