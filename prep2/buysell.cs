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

    public int trade(int[] array){
     int maxProfit=0;

        for(int i = 0; i < array.Length; i++)
        {
            for(int j=i+1; j < array.Length; j++)
            {
                int profit=array[j] - array[i];
                if (profit > maxProfit)
                {
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }

    public int MaxProfit(int[] array){
    int maxProfit = 0;
    int minPrice = array[0];

    for (int i = 0; i < array.Length; i++)
    {
        int profit = array[i] - minPrice;

        if (profit > maxProfit)
        {
            maxProfit = profit;
        }

        if (array[i] < minPrice)
        {
            minPrice = array[i];
        }
    }

    return maxProfit;
}
}