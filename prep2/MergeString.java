class Solution {
    public String mergeString(String word1, String word2) {
        String merged= "";
        int i= 0;

        while (word1.length()>i || word1.length()<i) {
            if (word1.length() > i) {
                merged+=word1.charAt(i);
            }
            if (word1.length() < i) {
                merged+=word2.charAt(i);
            }
            i++;
        }

        return merged;
    }
}