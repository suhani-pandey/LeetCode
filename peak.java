public class peak {
    
    public boolean validMountainArray(int[] arr) {
    int n = arr.length;
    int i = 1;
    
    // Phase 1: climb up
    while (i < n && arr[i] > arr[i - 1]) {
        i++;
    }
    
    // Check: did we actually climb at all, and are we not already at the end?
    if (i == 1 || i == n) {
        return false;
    }
    
    // Phase 2: climb down
    while (i < n && arr[i] < arr[i - 1]) {
        i++;
    }
    
    // If we made it all the way to the end, it's a valid mountain
    return i == n;
}
}
