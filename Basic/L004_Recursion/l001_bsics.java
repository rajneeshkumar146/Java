package L004_Recursion;

public class l001_bsics {

    public static void main(String[] args) {

        System.out.println(fib(6));

    }

    // Basic syntax -----------------------------------------------------------

    // Faith: 1 se n - 1 tak increasing oder mein sb print sb hojyega, baki ka bacha
    // 1 mein khud print krlungi.
    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }

        printIncreasing(n - 1);
        System.out.println(n);
    }

    // Faith: si + 1 se ei tak increasing oder mein sb print sb hojyega, baki ka
    // bacha 1 mein khud print krlungi.
    public static void printIncreasing(int si, int ei) {
        if (si > ei) {
            return;
        }

        System.out.println(si);
        printIncreasing(si + 1, ei);
    }

    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncresingDecresing(int si, int ei) {
        if (si > ei) {
            return;
        }

        System.out.println(si);
        printIncresingDecresing(si + 1, ei);
        System.out.println(si);
    }

    public static void printDecresingIncresing(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecresingIncresing(n - 1);
        System.out.println(n);
    }

    // Questions ---------------------------------------------------------------

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int res = fib(n - 1) + fib(n - 2);
        return res;
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // T: O(b)
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return power(a, b - 1) * a;
    }

    // T: Log(b)
    public static int powerBetter(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int halfRes = powerBetter(a, b / 2);
        int res = halfRes * halfRes;

        return b % 2 == 0 ? res : res * 2;
    }

}
