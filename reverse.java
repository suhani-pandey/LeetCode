public class reverse {

    public int[] reverseArray(int[] nums) {

        int left = 0;
        int right = nums.length -1;

        while(left < right) {
            int temp= nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    public static void main(String[] args) {
        reverse r= new reverse();
        int[] nums = {1, 2, 3, 4, 5};
        nums = r.reverseArray(nums);
        System.out.print("Reversed Array: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
