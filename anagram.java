public class anagram {
    
    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for(int i=0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i=0; i < count.length; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        anagram a = new anagram();
        System.out.println(a.isAnagram("listen", "silent")); // true
        System.out.println(a.isAnagram("hello", "world")); // false
    }
}
