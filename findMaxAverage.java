class Solution {
    public double findMaxAverage(int[] nums, int k) {

        //get the sum for starting the window
        int sum = 0;
        //travesre until k  value of elements
        for(int i=0; i< k; i++)
            sum = sum + nums[i];
            int maxSum = sum;

            //start sliding window
            int startIndex = 0;
            int endIndex = k;
            while(endIndex<nums.length)
            {
                //remove the starting element and move one step ahead
                sum = sum - nums[startIndex];
                startIndex++;
                //add one more element at last 
                sum = sum + nums[endIndex];
                endIndex++;
                //get the max sum
                maxSum = Math.max(maxSum , sum);
            }
        return (double)maxSum/k;
    }
}

//Time - O(n)
//Space - O(1)