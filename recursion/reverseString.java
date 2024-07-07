package recursion;

public class reverseString {
    public static void reverseStringFunc(String string, int n) {
        System.out.print(string.charAt(n));
        if (n <= 0)
            return;
        reverseStringFunc(string, n - 1);
    }

    public static void main(String[] args) {
        String word = "abcd";
        reverseStringFunc(word, word.length() - 1);
    }
}
