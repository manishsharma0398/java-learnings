package recursion;

public class power {
    public static int calcPower(int base, int power) {
        if (power == 0) {
            return 1;
        }
        if (base == 0) {
            return 0;
        }
        int pow = base * calcPower(base, power - 1);
        return pow;
    }

    public static void main(String[] args) {
        int base = 2;
        int maxPower = -3;
        if (maxPower < 0) {
            double total = 1.0 / calcPower(base, -maxPower);
            System.out.println(base + "^" + maxPower + " = " + total);
        } else {
            int total = calcPower(base, maxPower);
            System.out.println(base + "^" + maxPower + " = " + total);
        }
    }
}
