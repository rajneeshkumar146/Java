package Basic.L001;

import java.util.Scanner;

public class T002_Take_Input {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please! Input three Numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        System.out.println("Three Inputed numbers: " + a + ", " + b + ", " + c);

        int maxNum = Integer.MIN_VALUE;
        // if (a > maxNum) {
        //     maxNum = a;
        // }
        // if (b > maxNum) {
        //     maxNum = b;
        // }
        // if (c > maxNum) {
        //     maxNum = c;
        // }

        if(a >= b && a >= c){
            maxNum = a;
        }else if(b >= a && b >= c){
            maxNum = b;
        }else{
            maxNum = c;
        }

        System.out.println("Your maximum number is: " + maxNum);

    }

}
