class Solution {
    public void moveZeroes(int[] nums) {
        //0 means that pointer starts at 0th index
        int insertPosition = 0;
        //start traverse
        for(int i=0; i<nums.length; i++)
        {
            //if the element is not 0 then place the element in the nums[insertposition]
            if(nums[i]!=0)
            {
            nums[insertPosition] = nums[i];
            insertPosition++;
            }
        }
        //at last till end place the 0 element by increasing it
        while(insertPosition<nums.length)
        {
        nums[insertPosition]=0;
        insertPosition++;
        }
    }
 }
 //Time - O(N)
 //Space - O(1) -> just in the same input array only replace the elements by increasing the insert insertPosition
 
 