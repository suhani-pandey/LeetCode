public class peak2 {
    
    public int peakIndex(int[] arr) {
        int left = 0;
        int right = arr.length -1;

        if(arr[left] > arr[left+1]) {
            return left;
        }
        if(arr[right] > arr[right-1]) {
            return right;
        }

        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        peak2 p= new peak2();
        int[] arr = {1, 3, 5, 8, 2};
        System.out.println("Peak Index: " + p.peakIndex(arr)); // Output: 2
    }
}
