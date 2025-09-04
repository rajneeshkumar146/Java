package L003_Questions_On_Array_ArrayList_StringBuilder;

public class T001_ArrayQueestions {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6 };
        arr[3] = 100;
        // System.out.println("Idx: " + removeDuplicate(arr));
    }

    // Question: Remove duplicate from the sorted array.
    // [1,2,3,3,3,4,4,4,4,5,6] -> idx: 5, [1,2,3,4,5,6,-,-,-,-,-]
    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        // sidx: starting idx.
        int sidx = 0;
        int itr = sidx + 1;
        while (itr < arr.length) {
            if (arr[sidx] != arr[itr]) {
                // sidx++;
                swap(arr, ++sidx, itr);
            }
            itr++;
        }

        for (int val : arr)
            System.out.print(val + " ");

        return sidx;
    }

    // Check array is sorted,
    // [1,1,2,2,3,3] -> true
    // [1,2,1,2,3,3] -> false
    public static boolean checkArrayIsSorted(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }

        int sidx = 1;
        while (sidx < arr.length) {
            if (arr[sidx - 1] > arr[sidx]) {
                return false;
            }
        }

        return true;
    }

    // Rotate array by k
    // [a,b,c,d,e,f,g,h], 3 -> [d,e,f,g,h,a,b,c]
    public static void rotateArrayByK(int[] arr, int k) {
        if (arr.length <= 1) {
            return;
        }

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, arr.length - k, arr.length - 1);
        reverseArray(arr, 0, arr.length - k - 1);
    }

    // Helper -------------------------------------------

    public static void reverseArray(int[] arr, int sidx, int eidx) {
        while (sidx <= eidx) {
            swap(arr, sidx++, eidx--);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
