package recursion;

import java.util.HashSet;

public class uniqueSubsequence {
    public static void subStr(String str, int idx, String newString, HashSet<String> set) {
        if (idx > str.length() - 1) {
            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currentChar = str.charAt(idx);
        String updtStr = newString + currentChar;
        subStr(str, idx + 1, updtStr, set);
        subStr(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aabbc";
        HashSet<String> set = new HashSet<>();
        subStr(str, 0, "", set);
    }
}
