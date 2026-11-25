/*Given a string, determine if it reads the same forwards and backwards, ignoring case and non-alphanumeric characters (spaces, punctuation).

Example:

"A man, a plan, a canal: Panama"

Ignoring punctuation/spaces/case, this becomes "amanaplanacanalpanama" — which reads the same backward. So the answer is true.*/

public class Solution {
    public bool IsPalindrome(string s) {
        StringBuilder cleaned = new StringBuilder();
        
        for (int i = 0; i < s.Length; i++) {
            char c = s[i];
            if (char.IsLetterOrDigit(c)) {
                cleaned.Append(char.ToLower(c));
            }
        }

        int left = 0;
        int right = cleaned.Length - 1;

        while (left < right)
        {
            if (cleaned[left] != cleaned[right])
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}