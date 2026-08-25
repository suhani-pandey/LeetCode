import java.util.Arrays;

public class interview {
    
    //return first num that appears twice
    public int firstNum(int[] nums){
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(i==j){continue;}
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    //two number when sums up that give the target
    public boolean containsSum(int[] nums, int target){
        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    //find largest difference
    public int largeDiff(int[] nums){
        int maxSum= Integer.MIN_VALUE;
        int currentSum = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++) {
                if(i==j){continue;}
                if(nums[j] > nums[i]){currentSum=nums[j]-nums[i];}
                else{currentSum=nums[i]-nums[j];}
                maxSum= Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    //first non-repeating character
    public char nonRepeatChar(String s){

        for(int i=0; i< s.length();i++){
            int count=0;
            for(int j=0; j< s.length();j++){
                if(i==j){continue;}
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count==0){
                return s.charAt(i);
            }

        }
        return '\0';
    }

    //longest consecutive sequence in a unsorted array
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        int longest=1;
        int current=1;
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++){
            if(nums[i]==nums[i-1]){continue;}
            if(nums[i]==nums[i-1]+1){
                current++;
            }else{
                longest=Math.max(longest,current);
                current=1;
            }
        }
        return Math.max(longest,current);
    }

    //find the missing number in an array of 0 to n
    public int missingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++){
            if(nums[i]!= nums[i-1]+1){
                return nums[i-1]+1;
            }
        }
        return -1;
    }

    //merge two sorted arrays
    public int[] mergeSorted(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length + nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++]=nums2[j++];         
            }

        while(i<nums1.length){
            merged[k++]=nums1[i++];
        }
        while(j<nums2.length){
            merged[k++]=nums2[j++];
        }

        
    }
    return merged;
}

    //move all zeros to the end of the array
    public int[] moveZero(int[] nums){
        int interpos = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[interpos]=nums[i];
                interpos++;
            }
        }

        while(interpos<nums.length){
            nums[interpos]=0;
            interpos++;
        }
        return nums;
    }

    //palindrome check
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }

}
