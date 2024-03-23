import java.util.Arrays;

public class FourSum {
    public static int fourSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1] + nums[2] + nums[3];
        int minDifference = Math.abs(resultSum - target);

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    int diffToTarget = Math.abs(sum - target);

                    if (diffToTarget < minDifference) {
                        resultSum = sum;
                        minDifference = diffToTarget;
                    }

                    if (sum == target) {
                        return target;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return resultSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 1;
        int closestSum = fourSumClosest(nums, target);
        System.out.println("Closest sum to target: " + closestSum);
    }
}

//Time - O(N)
//Space - O(1)
