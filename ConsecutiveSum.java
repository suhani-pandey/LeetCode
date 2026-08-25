// Maximum Subarray Sum (Kadane's Algorithm)

// Actually, let me give you something a bit more approachable first, since this is a very classic and frequently-asked "simple algorithm" question that's a great fit for a student-level interview.

// Step 1: Restate it

// Given an array of numbers (can include negative numbers), find the contiguous subarray (a chunk of consecutive numbers, not skipping around) that has the largest sum. Return that sum.

// Example: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// The best contiguous chunk is [4, -1, 2, 1], which sums to 4 + (-1) + 2 + 1 = 6. No other consecutive chunk beats that.

public class ConsecutiveSum {

    public int maxSubArray(int[] nums){

        int maxSum =  nums[0];
        int currentSum = 0;

        for(int i=0; i < nums.length; i++) {
            
            currentSum += nums[i];

            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    
}
