public class Solution
{
    public bool IsAnagram(string s, string t)
    {
        if (s.Length != t.Length)
        {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.Length; i++)
        {
            count[s[i] - 'a']++;
            count[t[i] - 'a']--;
        }

        for (int i = 0; i < count.Length; i++)
        {
            if (count[i] != 0)
            {
                return false;
            }
        }

        return true;
    }
}

public class Solution
{
    public bool IsAnagram(string s, string t)
    {
        if (s.Length != t.Length)
        {
            return false;
        }

        Dictionary<char, int> charCount = new Dictionary<char, int>();

        for (int i = 0; i < s.Length; i++)
        {
            char currentChar = s[i];

            if (charCount.ContainsKey(currentChar))
            {
                charCount[currentChar]++;
            }
            else
            {
                charCount.Add(currentChar, 1);
            }
        }

        for (int i = 0; i < t.Length; i++)
        {
            char currentChar = t[i];

            if (!charCount.ContainsKey(currentChar) || charCount[currentChar] == 0)
            {
                return false;
            }

            charCount[currentChar]--;
        }

        return true;
    }
}