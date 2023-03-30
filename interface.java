interface GCD {
    int computeGCD(int num1, int num2);
}

class APPROACH1 implements GCD {
    public int computeGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return computeGCD(num2, num1 % num2);
    }
}

class APPROACH2 implements GCD {
    public int computeGCD(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}

public class Main {
    public static void main(String[] args) {
        GCD approach1 = new APPROACH1();
        GCD approach2 = new APPROACH2();
        int num1 = 36, num2 = 48;
        System.out.println("GCD of " + num1 + " and " + num2 + " using APPROACH1: " + approach1.computeGCD(num1, num2));
        System.out.println("GCD of " + num1 + " and " + num2 + " using APPROACH2: " + approach2.computeGCD(num1, num2));
    }
}
