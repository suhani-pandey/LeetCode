public class twosum {
    
    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. if they dont then return -1.
    public int[] twoSum(int[] nums, int target) {

        for(int i=0; i < nums.length; i++) {
            for(int j=i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        twosum t= new twosum();
        int[] nums = {80, 7, 9, 15};
        int target = 9;
        int[] result = t.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
