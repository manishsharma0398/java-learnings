package patterns.basic.InvertedHalfPyramid;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (i > 1)
                System.out.println();
        }
    }
}
