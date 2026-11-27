public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int maxLength = 0;
        
        for (int start = 0; start < s.Length; start++) {
            HashSet<char> seen = new HashSet<char>();
            int currentLength = 0;
            
            for (int next = start; next < s.Length; next++) {
                if (seen.Contains(s[next])) {
                    break; // hit a repeat, stop extending this window
                }
                seen.Add(s[next]);
                currentLength++;
                maxLength = Math.Max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}