class Solution {
    public int largestAltitude(int[] gain) {
        //at starting it is 0
        int currentAltitude = 0;
        //now assign it has highest one 
        int highestPoint = currentAltitude;
        //traverse the array gain
        for(int altitude : gain){
            //add with prefix sum(previous value)
            currentAltitude+=altitude;
            //compare both and take max one
            highestPoint = Math.max(highestPoint,currentAltitude);
        }
        return highestPoint;
    }
}

//Time - O(N)
//Space - O(1)