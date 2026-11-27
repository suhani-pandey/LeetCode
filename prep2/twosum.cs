class TwoSum{
    public int[] TwoSum(int[] nums, int Target){

        for(int i=0;i < nums.Length; i++){
            for(int j=i+1; j < nums.Length; j++){
                if(nums[i]+nums[j]==Target){
                    return new int[] {i,j};
                }
            }
        }

        return Array.Empty<int>();
    }

    public int[] TwoSumDict(int[] nums, int Target){

        Dictionary<int, int> seen = new Dictionary<int, int>();
        for(int i = 0; i<nums.Length; i++)
        {
            int num=nums[i];
            int complement = Target-num;
            if (seen.ContainsKey(complement))
        {
            return new int[] { seen[complement], i };
        }

            seen.Add(num, i);
        }

        return Array.Empty<int>();
    }
}