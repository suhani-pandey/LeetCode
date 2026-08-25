public class majEle {
    
    public int majority(int[] nums) {
        int targetCount = nums.length/2;
        

        for(int i=0; i < nums.length; i++) {
            int count = 0;
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
                if(count >= targetCount) {
                    return nums[i];
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        majEle m= new majEle();
        int[] nums = {1, 1, 2, 2, 2};
        System.out.println("Majority Element: " + m.majority(nums)); // Output: 2
        int[] nums2 = {1,1,2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + m.majority(nums2)); // Output: 1
    }
}
