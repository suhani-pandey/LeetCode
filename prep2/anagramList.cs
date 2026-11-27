class Solution
{
    public IList<IList<string>> GroupAnagrams(string[] strs) {
    Dictionary<string, List<string>> groups = new Dictionary<string, List<string>>();
    
    foreach (string word in strs) {
        char[] chars = word.ToCharArray();
        Array.Sort(chars);
        string key = new string(chars);
        
        if (!groups.ContainsKey(key)) {
            groups[key] = new List<string>();
        }
        groups[key].Add(word);
    }
    
    return new List<IList<string>>(groups.Values);
}

public IList<IList<string>> GroupAnagrams(string[] strs) {
    Dictionary<string, List<string>> groups = new Dictionary<string, List<string>>();
    
    foreach (string word in strs) {
        int[] count = new int[26];
        foreach (char c in word) {
            count[c - 'a']++;
        }
        
        string key = string.Join(",", count);
        
        if (!groups.ContainsKey(key)) {
            groups[key] = new List<string>();
        }
        groups[key].Add(word);
    }
    
    return new List<IList<string>>(groups.Values);
}


}