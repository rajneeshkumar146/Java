package L003_Questions_On_Array_ArrayList_StringBuilder;

import java.util.*;

public class T002_ArrayList {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // ArrayList<Integer> arrList = intputInArrayList();
        // System.out.println(arrList);

        // System.out.println("get: " + arrList.get(2));
        // arrList.remove(2);
        // System.out.println(arrList);
        // System.out.println(arrList.size());

        // int[] arr = { 1, 2, 3, 4, 4, 4, 4, 5, 6 };
        // int[] ans = removeAllDuplicates(new int[] { 1, 2, 3, 4, 4, 4, 4, 5, 6 });
        // for (int val : ans)
        // System.out.print(val + " ");

        System.out.println(getAllPrimeNumbers(50));
    }

    /**
     * TimeComplexity:
     * get, add, size: O(1)
     * remove: O(N)
     * if remove if olny for last index: O(1)
     * 
     * @return
     */

    public static ArrayList<Integer> intputInArrayList() {
        ArrayList<Integer> arrList = new ArrayList<>();
        int N = scn.nextInt();
        for (int i = 0; i < N; i++) {
            arrList.add(scn.nextInt());
        }

        return arrList;
    }

    public static int[] removeAllDuplicates(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        Arrays.sort(arr);
        ArrayList<Integer> arrList = new ArrayList<>();

        int sidx = 0;
        arrList.add(arr[sidx++]);

        while (sidx < arr.length) {
            // if(arrList.get(arrList.size() - 1) != arr[sidx]){
            // arrList.add(arr[sidx]);
            // }
            if (arrList.getLast() != arr[sidx]) {
                arrList.add(arr[sidx]);
            }
            sidx++;
        }

        int[] res = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            res[i] = arrList.get(i);
        }

        return res;
    }

    // T: O(2N)
    public static int[] getAllIndex(int[] arr, int data) {
        int count = 0;
        for (int val : arr) {
            if (val == data)
                count++;
        }

        int[] indexArray = new int[count];
        int sidx = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == data) {
                indexArray[sidx++] = data;
            }
        }

        return indexArray; // to return empty array.
    }

    // T: O(N)
    public static ArrayList<Integer> getAllIndex2(int[] arr, int data) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == data) {
                res.add(idx);
            }
        }

        return res; // to return empty array.
    }

    // T: O(NSqrt(N))
    public static ArrayList<Integer> getAllPrimeNumbers(int N) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= (int) Math.sqrt(num); divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                res.add(num);
            }
        }
        return res;
    }

    public static ArrayList<Integer> getAllPrimeNumbers_2(int N) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                res.add(num);
            }
        }
        return res;
    }

    private static boolean isPrime(int num) {
        for (int divisor = 2; divisor <= (int) Math.sqrt(num); divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
