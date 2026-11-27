class ProductOfArray
{
    public int[] ProductExceptSelf(int[] nums)
    {
        int[] answer = new int[nums.Length];

        for (int i = 0; i < nums.Length; i++)
        {
            int product = 1;

            for (int j = 0; j < nums.Length; j++)
            {
                if (i != j)
                {
                    product *= nums[j];
                }
            }

            answer[i] = product;
        }

        return answer;
    }

    public int[] ProductExceptSelf(int[] nums) {
    int n = nums.Length;
    int[] answer = new int[n];
    
    // Step 1: fill answer[i] with product of everything to the LEFT of i
    answer[0] = 1; // nothing to the left of index 0
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }
    
    // Step 2: multiply in the product of everything to the RIGHT of i,
    // tracked as we walk backwards
    int rightProduct = 1; // nothing to the right of the last index
    for (int i = n - 1; i >= 0; i--) {
        answer[i] *= rightProduct;
        rightProduct *= nums[i];
    }
    
    return answer;
}
}