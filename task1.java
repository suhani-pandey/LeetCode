public class task1 {
    
    public int maxPair(String letter){
        int maxNum = 0;
        int odd = 0, even = 0;
        
        for(int i=0; i < letter.length(); i++) {
            int number = letter.charAt(i) - '0';
            if(number % 2 == 0) {
                even++;
            } else {
                odd++;
            };
        }
        maxNum = Math.min(odd, (odd+even)/2);
        return maxNum;

    }

    public int maxPair1(String letter){
        int maxNum = 0;
        int odd = 0, even = 0;
        
        for(char c: letter.toCharArray()) {
            int number = c - '0';
            if(number % 2 == 0) {
                even++;
            } else {
                odd++;
            };
        }
        maxNum = Math.min(odd, (odd+even)/2);
        return maxNum;

    }

    public static void main(String[] args) {
        task1 t= new task1();
        System.out.println(t.maxPair("123456789"));
        System.out.println(t.maxPair1("123456789"));
    }


}
