// Restate it

// You're given an array containing n distinct numbers, taken from the range 0 to n (that's n+1 possible numbers total), but one number is missing from the array. Find which one is missing.

// Example: nums = [3, 0, 1]
// Here n = 3 (the array has 3 elements), so the full range should be 0, 1, 2, 3 (that's 4 numbers). The array only has 3, 0, 1 — so 2 is missing.

public class FindMissingNumber {

    public int missingNumber(int[] arrays){

        int n = arrays.length;

        int expectedSum = 0;
        for(int i=0;  i <=n; i++) {
            expectedSum += i;
        }

        int actualSum = 0;
        for(int i = 0; i < n; i++) {
            actualSum += arrays[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        FindMissingNumber fmn = new FindMissingNumber();
        int[] nums = {3, 0, 1};
        System.out.println(fmn.missingNumber(nums)); // Output: 2
    }
    
}


