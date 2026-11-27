class Solution
{
    public List<int> SpiralOrder(int[][] matrix) {
    List<int> result = new List<int>();
    
    int top = 0;
    int bottom = matrix.Length - 1;
    int left = 0;
    int right = matrix[0].Length - 1;
    
    while (top <= bottom && left <= right) {
        // Step 1: walk right along the top row
        for (int col = left; col <= right; col++) {
            result.Add(matrix[top][col]);
        }
        top++;
        
        // Step 2: walk down along the right column
        for (int row = top; row <= bottom; row++) {
            result.Add(matrix[row][right]);
        }
        right--;
        
        // Step 3: walk left along the bottom row (only if top <= bottom still valid)
        if (top <= bottom) {
            for (int col = right; col >= left; col--) {
                result.Add(matrix[bottom][col]);
            }
            bottom--;
        }
        
        // Step 4: walk up along the left column (only if left <= right still valid)
        if (left <= right) {
            for (int row = bottom; row >= top; row--) {
                result.Add(matrix[row][left]);
            }
            left++;
        }
    }
    
    return result;
}
}