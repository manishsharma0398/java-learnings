package recursion;

public class factorial {
    public static int calcFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int fact = n * calcFactorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int total = calcFactorial(n);
        System.out.println("factorial of " + n + " is " + total);
    }
}
