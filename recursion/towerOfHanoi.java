package recursion;

public class towerOfHanoi {
    public static void towerOfHanoiFunc(int n, String src, String helper, String dest) {
        if (n <= 1) {
            System.out.print("\ntransfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoiFunc(n - 1, src, dest, helper);
        System.out.print("\ntransfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoiFunc(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 5;
        towerOfHanoiFunc(n, "S", "H", "D");
    }
}
