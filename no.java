public class no{

    // find the first character that is non-repeating in a string and return it. If there is no such character, return null character.
    public char getChar(String letter){

        int[] count = new int[256];
        for(int i=0; i < letter.length(); i++) {
            count[letter.charAt(i)]++;
        }
        for(int i=0; i < letter.length(); i++) {
            if(count[letter.charAt(i)] == 1) {
                return letter.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        no n= new no();
        System.out.println(n.getChar("aabbccddeeffg"));
        System.out.println(n.getChar("aabbcddeffgg"));
    }
}