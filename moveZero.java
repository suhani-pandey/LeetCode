public class moveZero {
    
    public int[] moveZeros(int[] nums) {

        int interpos = 0;

        for(int i=0; i< nums.length; i++) {
            if(nums[i] !=0) {
                nums[interpos] = nums[i];
                interpos++;
            }
        }

        while(interpos < nums.length) {
            nums[interpos] = 0;
            interpos++;
        }
        return nums;
    }

    public static void main(String[] args) {
        moveZero m= new moveZero();
        int[] nums = {0, 1, 0, 3, 12};
        nums = m.moveZeros(nums);
        System.out.print("Result: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
