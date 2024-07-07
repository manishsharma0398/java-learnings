package recursion;

public class firstAndLastOccurence {
    public static int firstOccurence = -1;
    public static int lastOccurence = -1;

    public static void firstAndLastOccurenceFunc(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First occurrence is at " + firstOccurence);
            System.out.println("Last occurrence is at " + lastOccurence);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (firstOccurence == -1) {
                firstOccurence = idx;
                lastOccurence = idx;
            } else {
                lastOccurence = idx;
            }
        }

        firstAndLastOccurenceFunc(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String word = "narendran";
        firstAndLastOccurenceFunc(word, 0, 'n');
    }
}
