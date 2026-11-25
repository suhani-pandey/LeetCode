class Solution
{
    public int[] trade(int[] array){
     int maxProfit=0;
     int buy=-1;
     int sell=-1;

        for(int i = 0; i < array.Length; i++)
        {
            for(int j=i+1; j < array.length; j++)
            {
                int profit=array[j] - array[i];
                if (profit > maxProfit)
                {
                    maxProfit=profit;
                    buy=i;
                    sell=j;
                }
            }
        }
        if (buyIndex == -1)
        {
            return Array.Empty<int>();
        }

        return new int[] { buyIndex, sellIndex };
    }
}