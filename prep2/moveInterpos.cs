class Solution
{
    public void MoveZeroes(int[] array)
{
    int insertPos = 0;

    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] != 0)
        {
            int temp = array[insertPos];
            array[insertPos] = array[i];
            array[i] = temp;
            insertPos++;
        }
    }
} 
}