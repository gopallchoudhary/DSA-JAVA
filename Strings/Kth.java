package Strings;

public class Kth {

    static void getWord(int k, StringBuilder word) {
        if (k <= 1) {
            return;
        } else {
            StringBuilder temp = new StringBuilder();
            int i = 0, len = word.length();

            while (i < len) {
                if (word.charAt(i) == 'z') {
                    temp.append('a');
                } else {
                    temp.append((char) (word.charAt(i + 1)));
                }
                i++;
                k--;
            }

            word.append(temp);
            getWord(k, word);
        }
    }

    public static char kth(int k, StringBuilder word) {
        getWord(k, word);
        return word.charAt(k - 1);
    }

    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("a");
        int k = 5;
        kth(k, word);
    }

}