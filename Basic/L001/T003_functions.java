package Basic.L001;

import java.util.Scanner;

public class T003_functions {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // String res = GreaterOutOfThreeNumber2();
        // System.out.println("Return res: " + res);

        int inputNumber = scn.nextInt();
        printTriangle2(inputNumber);

    }

    public static void GreaterOutOfThreeNumber() {
        System.out.println("Please! Input three Numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        System.out.println("Three Inputed numbers: " + a + ", " + b + ", " + c);

        int maxNum = Integer.MIN_VALUE;
        // if (a > maxNum) {
        // maxNum = a;
        // }
        // if (b > maxNum) {
        // maxNum = b;
        // }
        // if (c > maxNum) {
        // maxNum = c;
        // }

        if (a >= b && a >= c) {
            maxNum = a;
        } else if (b >= a && b >= c) {
            maxNum = b;
        } else {
            maxNum = c;
        }

        System.out.println("Your maximum number is: " + maxNum);

    }

    public static String GreaterOutOfThreeNumber2() {
        System.out.println("Please! Input three Numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        System.out.println("Three Inputed numbers: " + a + ", " + b + ", " + c);

        int maxNum = Integer.MIN_VALUE;
        // if (a > maxNum) {
        // maxNum = a;
        // }
        // if (b > maxNum) {
        // maxNum = b;
        // }
        // if (c > maxNum) {
        // maxNum = c;
        // }

        if (a >= b && a >= c) {
            maxNum = a;
        } else if (b >= a && b >= c) {
            maxNum = b;
        } else {
            maxNum = c;
        }

        return "Your maximum number is: " + maxNum;
    }

    public static void printTriangle(int sizeOfTriangle) {
        /**
         * nst: number of stars.
         */

        int nst = 1;
        for (int row = 1; row <= sizeOfTriangle; row++) {
            // cst: count of star
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*");
            }

            System.out.println();
            nst += 2;
        }
    }

    public static void printTriangle2(int N) {
        /**
         * nst: number of stars.
         * nsp: number of space.
         */

        int nst = 1;
        int nsp = N / 2;

        for (int row = 1; row <= N; row++) {
            // cst: count of space
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }

            // cst: count of star
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*");
            }

            // cst: count of space
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }

            System.out.println();

            if (row < N / 2) {
                nst += 2;
                nsp -= 1;
            } else {
                nst -= 2;
                nsp += 1;
            }
        }
    }
}
