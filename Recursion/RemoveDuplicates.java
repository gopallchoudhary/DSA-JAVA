package Recursion;

public class RemoveDuplicates {

    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        if(map[currentChar - 'a'] == true) {
            removeDuplicates(str, idx+1, newString, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString.append(currentChar), map);
        }

    }

    public static void main(String[] args) {
        removeDuplicates("gopal", 0, new StringBuilder(), new boolean[26]);
    }
}
