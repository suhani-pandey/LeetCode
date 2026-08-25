public class mergeArray {
    
    // merge the two sorted array and the merged array should be sorted
    public int[] merge(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while(i < nums1.length) {
            merged[k++] = nums1[i++];
        }

        while(j < nums2.length) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }
    }
