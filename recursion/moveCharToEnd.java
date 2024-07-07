package recursion;

public class moveCharToEnd {
    public static int charCount = 0;
    public static String newWord = "";

    public static void moveCharToEndFunc(String word, int idx) {
        if (idx > word.length() - 1) {
            return;
        }

        if (word.charAt(idx) == 'x') {
            charCount++;
        } else {
            newWord += word.charAt(idx);
        }
        moveCharToEndFunc(word, idx + 1);
    }

    public static void main(String[] args) {
        String dev = "xxxabxcxdxefgh";
        moveCharToEndFunc(dev, 0);
        if (charCount > 0) {
            for (int i = 0; i < charCount; i++) {
                newWord += "x";
            }
        }
        System.out.println("x count is " + charCount);
        System.out.println("New word is " + newWord);
    }
}
