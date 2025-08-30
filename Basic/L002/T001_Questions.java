package Java.Java.Basic.L002;

public class T001_Questions {
    public static void main(String args[]) {

    }

    public static int rotateNumber(int N, int K) {
        int d = countDigit(N);
        K = (K % d + d) % d;

        int divisor = (int) Math.pow(10, d - K);
        int multipler = (int) Math.pow(10, K);

        int quo = N / divisor;
        int rem = N % divisor;

        return quo * multipler + rem;
    }

    public static int reverseNumber(int N) {
        int ans = 0;
        while (N != 0) {
            int rem = N % 10;
            N /= 10;

            ans = ans * 10 + rem;
        }
        return ans;
    }

    public static int countDigit(int N) {
        int count = 0;
        while (N != 0) {
            N /= 10;
            count++;
        }
        return count;
    }

    public static boolean isEven(int N) {
        return N % 2 == 0;
    }

}
