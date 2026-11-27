class Solution
{
    public bool ContainsDuplicate(int[] array)
    {
        HashSet<int> arrays= new HashSet<int>();

        foreach(int num in array)
        {
            arrays.Add(num);
        }

        if (arrays.Count == array.Length)
        {
            return false;
        }
        return true;
    }
}