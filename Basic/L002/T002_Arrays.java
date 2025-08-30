package Java.Basic.L002;

import java.util.*;

public class T002_Arrays {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String args[]) {

        int[] arr = { 1, 3, 4, 4, 5, 6, 7, 5, 8, 5, 7, 5, 10, 11 };
    }

    public static int findMaximumNumber(int[] arr){
        int maximumNumber = Integer.MIN_VALUE;
        
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > maximumNumber) {
        //         maximumNumber = arr[i];
        //     }
        // }
        
        
        for(int num : arr){
            maximumNumber = Math.max(maximumNumber, num);
        }

        return maximumNumber;
    }

    public static int findMinimumNumber(int[] arr){
        int minimumNumber = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] < minimumNumber) {
        //         minimumNumber = arr[i];
        //     }
        // }

        for(int num : arr){
            minimumNumber = Math.min(minimumNumber, num);
        }

        return minimumNumber;
    }

    public static int findLastIndex(int[] arr, int number) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    // Last baar number kaunse index pe mila hai,
    public static int findLastIndex2(int[] arr, int number) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1; // Number exist nahi krta hai, isliye uska index -1.
    }

    // Pheli baar number kaunse index pe mila hai,
    public static int findFirstIndex(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1; // Number exist nahi krta hai, isliye uska index -1.
    }

    // FindElement
    public static boolean isNumberPresent(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int findOccurence(int[] arr, int occurenceNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == occurenceNumber) {
                count++;
            }
        }
        return count;
    }

    // helper Method. ------------------------------

    public static void createArrayUsingCustomInput() {
        int N = scn.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
