package Questions.Strings;

import java.util.Scanner;

public class Vowels {
    public static int noOfLowerVowels(String str) {
        int index = 0;
        char vowel[] = {'a', 'e', 'i', 'o', 'u'};
        for(int i=0; i<str.length(); i++) {
            // char c = str.charAt(i);
            // if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u') {
            //     index++;
            // }
            for(int j=0; j<vowel.length; j++) {
                if(str.charAt(i) == vowel[j]) {
                    index++;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your text ");
        // String inputStr = sc.nextLine();
        // System.out.println(noOfLowerVowels(inputStr));

        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);

        sc.close();
    }
}
