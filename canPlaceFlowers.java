class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]==0)
            {
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i-1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);

                //If both are empty then plant a tree
                if(emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count ++;
                }
            }
        }
        return count >= n;
    }
}

//Time - O(N) -> Single traverse of array
//Space - O(1) -> No extra space 