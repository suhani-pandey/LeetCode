public class interpos {
    
    public int[] moveNegatives(int[] nums) {

        int interpos = 0;

        for(int i=0; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp= nums[interpos];
                nums[interpos] = nums[i];
                nums[i] = temp;
                interpos++;
            }
        }
        return nums;
    }
}
