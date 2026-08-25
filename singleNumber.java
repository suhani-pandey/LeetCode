public class singleNumber {
    
    public int singlenumber(int[] nums) {
         int result = -1;
         for(int i=0; i < nums.length; i++) {
            int count = 0;
            for(int j= 0; j < nums.length; j++) {
                if(i == j) {
                    continue;
                }
                if(nums[i] == nums[j]) {
                    count++;
                }
                }
                if(count == 0){
                    result = nums[i];
                }
            }
            return result;
         }

    public static void main(String[] args) {
        singleNumber s= new singleNumber();
        int[] nums = {4,3,4, 1, 2, 1, 2};
        System.out.println("Single Number: " + s.singlenumber(nums)); // Output: 4
    }
}
