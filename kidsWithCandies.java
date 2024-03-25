import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //find the greates number of candies among all
        int maxCandies = 0;
        for(int candy : candies){
            maxCandies = Math.max(candy, maxCandies);
        }
 
 
    //now traverse again and add the extra candies and add it to the result array by comparing with the maxCandy
    List<Boolean> result = new ArrayList<>();
    for(int candy:candies){
        result.add(candy + extraCandies >= maxCandies);
    }
    return result;
    }
 }
 //Time - O(N) -> for traverse to find the max candy it is o(n) and for adding extra candies to traverse it takes o(n) -> so total is O(N) since the combined of these gives linear time complexity
 //Space - O(1) -> no extra space other than variables.
 
 
 
 