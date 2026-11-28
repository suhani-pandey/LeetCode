class Solution
{
    public int[] Reverse(int[] array)
{
    List<int> newReverse = new List<int>();

    for (int i = array.Length - 1; i >= 0; i--)
    {
        newReverse.Add(array[i]);
    }
    return newReverse.ToArray();
}

    public int[] Pointer(int[] array)
    {
        int left=0;
        int right=array.Length-1;

        while (left < right)
        {
            //(array[left], array[right]) = (array[right], array[left]);
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
        
        left++;
        right--;
        }
        
    }
}