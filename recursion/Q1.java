package recursion;

public class Q1 {
    public static void printNumbers(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        printNumbers(n + 1);
    }
    // public static void printNumbers(int n) {
    // if (n <= 0) {
    // return;
    // }
    // System.out.println(n);
    // printNumbers(n - 1);
    // }

    public static void main(String[] args) {
        printNumbers(1);
        // printNumbers(5);
    }
}
