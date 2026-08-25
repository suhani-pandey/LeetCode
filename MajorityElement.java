// Given an array of numbers, find the element that appears more than half the time (this is called the "majority element"). The problem usually guarantees that such an element always exists in the array.

// Example: nums = [2, 2, 1, 1, 1, 2, 2]

// There are 7 numbers total. 2 appears 4 times, 1 appears 3 times. Since 4 > 7/2 (which is 3.5), 2 is the majority element.

public class MajorityElement {

    public int majorityElement(int[] nums) {

       int halfLength = nums.length / 2;

       for(int i = 0; i < nums.length; i++) {

        int count = 0;

        for(int j = 0; i < nums.length; j++) {
            if(nums[i] == nums[j]) {
                count++;
            }

            if(count > halfLength) {
                return nums[i];
            }

        } 
       }

       return -1;

    }
    
}
