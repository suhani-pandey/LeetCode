// A palindrome is a word/phrase that reads the same forwards and backwards — like "racecar" or "level".

// Question for you: given a string like "hello", how would you check — just by thinking about it, no code yet — whether it's the same forwards and backwards?

public class CheckPalindrome {

    public boolean isPalindrome(String str) {
    String reversed = "";
    for(int i = str.length() - 1; i >=0; i--) {
        reversed += str.charAt(i);
    }
    return str.equals(reversed);
    }


    public static void main(String[] args) {
        CheckPalindrome cp = new CheckPalindrome();
        System.out.println(cp.isPalindrome("racecar")); // true
        System.out.println(cp.isPalindrome("hello")); // false
    }



}
