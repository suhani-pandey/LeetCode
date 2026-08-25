// Binary Search
// Step 1: Restate it

// You're given a sorted array of numbers, and a target number you're looking for. Find the position (index) of that target in the array. If it's not there, return -1.

// Example: nums = [1, 3, 5, 7, 9, 11], target = 7

// The answer is index 3 (since nums[3] = 7).

public class BInarySearch {

    public int search(int[] nums, int target) {

        for(int i=0; i < nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        BInarySearch bs = new BInarySearch();
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 7;
        System.out.println(bs.search(nums, target)); // Output: 3
    }
}

