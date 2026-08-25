// Find the First Non-Repeating Character
// Step 1: Restate it

// Given a string, find the first character that appears only once (doesn't repeat anywhere else in the string). Return that character (or its position/index).

// Example: s = "swiss"

// Let's look at each letter: s, w, i, s, s

// s appears 3 times (positions 0, 3, 4)
// w appears 1 time (position 1)
// i appears 1 time (position 2)

// The first character that only appears once is w (at position 1) — even though i also only appears once, w comes before it in the string.

public class checkUniqueCharacter {

    public char firstUniqueChar(String s) {

        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){
            boolean isUnique = true;

            for(int j = 0; j < chars.length; j++) {
                if (j == i) {
                    continue;
                }

                if (chars[i] == chars[j]) {
                    isUnique = false;
                    break;
                }


            }
            if (isUnique) {
                return chars[i];
            }
        }

        return ' ';
    }
    
}
