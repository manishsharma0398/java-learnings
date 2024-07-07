package recursion;

public class subsequencesOfAString {
    public static void subStr(String str, int idx, String newString) {
        if (idx > str.length() - 1) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        String updtStr = newString + currentChar;
        subStr(str, idx + 1, updtStr);
        subStr(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subStr(str, 0, "");
    }
}
