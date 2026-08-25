public class binSearch {
    
    public int binarySearch(int[] nums, int target) {

        for(int i=0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch2(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] > target) {
                right = mid-1;
            }
            else if(nums[mid] < target) {
                left = mid+ 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binSearch b= new binSearch();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println("Index of " + target + ": " + b.binarySearch(nums, target)); // Output: 2
        System.out.println("Index of " + target + ": " + b.binarySearch2(nums, target)); // Output: 2
    }
}
