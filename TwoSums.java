// Problem 2: Two Sum
// Step 1: Restate it

// Given a list of numbers and a target number, find two numbers in the list that add up to the target. Usually you return their positions (indices) in the list.

// Example: nums = [2, 7, 11, 15], target = 9
// Answer: indices 0 and 1, because nums[0] + nums[1] = 2 + 7 = 9.

public class TwoSums {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {};


    }
    

    public static void main(String[] args) {
        TwoSums ts = new TwoSums();
        int[] nums = {2, 9, 0, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }
}
