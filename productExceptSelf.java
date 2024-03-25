class Solution {
   public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       //array for left pass
       int[] lp = new int[n];
       //array for rightpass
       int[] rp = new int[n];
       //array for both lp and rp
       int[] ans = new int[n];
       //calculate left product
       lp[0] = 1;
       for(int i =1; i<n; i++){
           lp[i] = lp[i-1] * nums[i-1];
       }
       //calculate right product
       rp[n-1] = 1; //last element
       for(int i=n-2; i>=0; i--){        //loop starts from last before element
           rp[i] = rp[i+1] * nums[i+1];
       }
       //for both product
       for(int i=0;i<n;i++){
           ans[i] = lp[i] * rp[i];
       }
       return ans;
   }
}

//Time - left pass O(N),Right pass O(N) -> Total O(N)
//Space - lp array-O(N), rp array-O(n), result array-O(N) -> Total O(N)


BUT WRITE SOLUTION WITHOUT EXTRA SPACE

class Solution {
    public int[] productExceptSelf(int[] nums) {

        // The length of the input array 
        int n = nums.length;

        // Final answer array to be returned
        int[] ans = new int[n];

        // answer[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so the answer[0] would be 1
        ans[0] = 1;
        for (int i = 1; i < n; i++) {

            // answer[i - 1] already contains the product of elements to the left of 'i - 1'
            // Simply multiplying it with nums[i - 1] would give the product of all 
            // elements to the left of index 'i'
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        // R contains the product of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right,
        // so the R would be 1
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {

            // For the index 'i', R would contain the 
            // product of all elements to the right. We update R accordingly
            ans[i] = ans[i] * R;
            R = R * nums[i];
        }

        return ans;
    }
}

//Time - O(N)
//Space - O(1)


