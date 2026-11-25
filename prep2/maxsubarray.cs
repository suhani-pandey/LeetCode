/*You are given an integer array nums. Find the contiguous subarray (at least one number) that has the largest sum, and return that sum.*/

class Solution
{
    public int MaxSubArray(int[] nums)
    {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int i = 0; i < nums.Length; i++)
        {
            //currentSum = Math.Max(nums[i], currentSum + nums[i]);
            currentSum += nums[i];

            maxSum = Math.Max(maxSum, currentSum);

            if (currentSum < 0)
            {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}