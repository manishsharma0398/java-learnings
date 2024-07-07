package recursion;

public class removeDuplicatesInString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx > str.length() - 1) {
            System.out.println("sanitized string is: " + newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (!map[currChar - 'a']) {
            map[currChar - 'a'] = true;
            newString += currChar;
        }
        removeDuplicates(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String word = "abxcxde";
        removeDuplicates(word, 0, "");
    }
}
