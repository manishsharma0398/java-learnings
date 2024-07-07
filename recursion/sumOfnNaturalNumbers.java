package recursion;

public class sumOfnNaturalNumbers {
    public static int sum(int n) {
        if (n > 100) {
            return 0;
        }
        int total = n + sum(n + 1);
        return total;
    }

    public static void main(String[] args) {
        int total = sum(1);
        System.out.println("total " + total);
    }
}
