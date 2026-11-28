class Solution
{
    public int MajorityElement(int[] nums)
{
    Dictionary<int, int> counts = new Dictionary<int, int>();
    int threshold = nums.Length / 2;

    foreach (int num in nums)
    {
        if (counts.ContainsKey(num))
        {
            counts[num]++;
        }
        else
        {
            counts[num] = 1;
        }

        if (counts[num] > threshold)
        {
            return num;
        }
    }

    return -1; // shouldn't reach here, since problem guarantees a majority element exists
}
}