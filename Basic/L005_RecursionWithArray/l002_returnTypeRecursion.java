package L005_RecursionWithArray;

import java.util.*;

public class l002_returnTypeRecursion {
    public static void main(String[] args) {
        // System.out.println(subsequence("abc", 0));

    }

    // Subsequence of string.

    public static ArrayList<String> subsequence(String str, int idx) {
        if (idx == str.length()) {
            ArrayList<String> myAns = new ArrayList<>();
            myAns.add("");
            return myAns;
        }

        ArrayList<String> recAns = subsequence(str, idx + 1);
        ArrayList<String> myAns = new ArrayList<>();

        // myAns.addAll(recAns); // means firstCharacter ko answer mein include nahi
        // krenge.

        for (String s : recAns) {
            myAns.add(s); // means firstCharacter ko answer mein include nahi krenge.
            myAns.add(str.charAt(idx) + s); // means firstCharacter ko answer mein include krenge.
        }

        return myAns;
    }

}
