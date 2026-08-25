public class palindrome {
    
    public boolean isPalindrome(String s) {

        int right = s.length()-1;
        int left = 0;
        

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome p= new palindrome();
        System.out.println(p.isPalindrome("racecar")); // true
        System.out.println(p.isPalindrome("hello")); // false
    }
}
