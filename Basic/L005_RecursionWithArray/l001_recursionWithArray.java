package L005_RecursionWithArray;

import java.util.*;

public class l001_recursionWithArray {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30, 40, 50 };
        // printArray(arr, 0);
        // printArray_With_psf(arr, 0, "");

        int[] arr = { 20, 20, 30, 20, 50 };
        ArrayList<Integer> res = new ArrayList<>();
        allIndex(arr, 20, 0, res);
        System.out.println(res);
    }

    public static void printArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.println(arr[idx]);
        printArray(arr, idx + 1);
    }

    // psf: path so far.
    // asf: answer so far.
    public static void printArray_With_psf(int[] arr, int idx, String psf) {
        if (idx == arr.length) {
            System.out.println(psf);
            return;
        }

        printArray_With_psf(arr, idx + 1, psf + arr[idx] + " ");
    }

    // Q: (N <= arr[idx] <= M), arr.length : [0, 10^6]
    public static int getMaximum(int[] arr, int idx) {
        if (idx == arr.length) {
            // return Long.MIN_VALUE;
            return Integer.MIN_VALUE;
        }

        int maxSoFar = getMaximum(arr, idx + 1);
        return Math.max(maxSoFar, arr[idx]);
    }

    // Q: (N <= arr[idx] <= M), arr.length : [1, 10^6]
    public static int getMaximum2(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int maxSoFar = getMaximum2(arr, idx + 1);
        return Math.max(maxSoFar, arr[idx]);
    }

    // Q: (N <= arr[idx] <= M), arr.length : [0, 10^6]
    public static int getMinimum(int[] arr, int idx) {
        if (idx == arr.length) {
            // return Long.MAX_VALUE;
            return Integer.MAX_VALUE;
        }

        int maxSoFar = getMinimum(arr, idx + 1);
        return Math.min(maxSoFar, arr[idx]);
    }

    // Q: (N <= arr[idx] <= M), arr.length : [1, 10^6]
    public static int getMinimum2(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int maxSoFar = getMinimum2(arr, idx + 1);
        return Math.min(maxSoFar, arr[idx]);
    }

    // Q: (N <= arr[idx] <= M), arr.length : [0, 10^6]
    // arr: [10, 20, 20, 20, 30, 40], 20
    // fundIdx and lastIdx both have same logic.
    public static int findIndex(int[] arr, int idx, int data) {
        if (idx == arr.length) {
            return -1;
        }

        int resIdx = findIndex(arr, idx + 1, data);
        // if (resIdx != -1) {
        // return resIdx;
        // }

        // return arr[idx] == data ? idx : -1;

        return resIdx != -1 ? resIdx : arr[idx] == data ? idx : -1;
    }

    // Faith: ????
    // arr: [20, 20, 20, 20, 30, 40], 20
    public static int firstIndex(int[] arr, int idx, int data) {
        if (idx == arr.length) {
            return -1;
        }

        int resIdx = firstIndex(arr, idx + 1, data);
        return arr[idx] == data ? idx : resIdx;
    }

    // arr: [20, 20, 20, 30, 20, 40], 20 -> [0, 1, 2, 4]
    public static void allIndex(int[] arr, int data, int idx, ArrayList<Integer> res) {
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == data) {
            res.add(idx);
        }

        allIndex(arr, data, idx + 1, res);
    }

    public static int[] allIndex(int[] arr, int data, int idx, int count) {
        if (idx == arr.length) {
            return new int[count];
        }

        count = arr[idx] == data ? count + 1 : count;
        int[] ans = allIndex(arr, data, idx + 1, count);

        if (arr[idx] == data) {
            ans[count - 1] = idx;
        }

        return ans;
    }

    // [3, 1 , 0, 2] -> [2, 1, 3, 0]
    // 0 <= arr[idx] <= arr.length - 1
    public static void inverseOfArray(int[] arr, int idx){

    }

    

}
