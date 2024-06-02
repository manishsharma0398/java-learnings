package patterns.basic.HalfPyramid;

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (n != i)
                System.out.println();
        }
    }
}
