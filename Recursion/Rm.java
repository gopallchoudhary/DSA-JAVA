package Recursion;

public class Rm {

    public static void duplicates(String str, int idx, StringBuilder newString, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        if (map[currentChar - 'a'] == true) {
            duplicates(str, idx + 1, newString, map);
        } else {
            map[currentChar - 'a'] = true;
            duplicates(str, idx + 1, newString.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        duplicates("gopal", 0, new StringBuilder(), new boolean[26]);
        StringBuilder newString = new StringBuilder("a");
        System.out.println(newString);
        
    }
}