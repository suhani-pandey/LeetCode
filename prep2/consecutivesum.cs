class Solution
{
    public int MaxSubArray(int[] array)
{
    int maxSum = array[0];
    int currentSum = array[0];

    for (int i = 1; i < array.Length; i++)
    {
        currentSum = Math.Max(array[i], currentSum + array[i]);
        maxSum = Math.Max(maxSum, currentSum);
    }

    return maxSum;
}
}