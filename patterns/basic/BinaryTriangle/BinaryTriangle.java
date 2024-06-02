package patterns.basic.BinaryTriangle;

public class BinaryTriangle {
    public static void main(String[] args) {
        int n = 5;
        boolean isEnabled = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(isEnabled ? "1 " : "0 ");
                isEnabled = !isEnabled;
            }
            if (i < n)
                System.out.println();
        }
    }
}
