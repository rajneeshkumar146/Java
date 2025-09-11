package L005_RecursionWithArray;

import java.lang.reflect.Array;
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

    public static ArrayList<String> mazePath(int startingRowIdx, int startingColIdx, int endingRowIdx,
            int endingColIdx) {
        // Invalid place.
        if (startingRowIdx > endingRowIdx || startingColIdx > endingColIdx) {
            return new ArrayList<>();
        }

        // My destination point.
        if (startingRowIdx == endingRowIdx && startingColIdx == endingColIdx) {
            ArrayList<String> recAns = new ArrayList<>();
            recAns.add("");
            return recAns;
        }

        ArrayList<String> recAnsOfHorizontalMove = mazePath(startingRowIdx, startingColIdx + 1, endingRowIdx,
                endingColIdx);
        ArrayList<String> recAnsOfVerticalMove = mazePath(startingRowIdx + 1, startingColIdx, endingRowIdx,
                endingColIdx);

        ArrayList<String> myAns = new ArrayList<>();
        for (String s : recAnsOfHorizontalMove) {
            myAns.add("H" + s);
        }
        for (String s : recAnsOfVerticalMove) {
            myAns.add("V" + s);
        }

        return myAns;
    }

}
