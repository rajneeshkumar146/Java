package L005_RecursionWithArray;

import java.util.ArrayList;

public class l003_voidTypeRecursion {
    public static void main(String[] args) {

        ArrayList<String> res = new ArrayList<>();

        // subsequence("abc", "", res);
        // mazePath(0, 0, 2, 2, "", res);
        boardPath(0, 10, "");

        System.out.println(res);

    }

    // Subsequence of string.

    public static void subsequence(String str, String asf, ArrayList<String> res) {
        if (str.length() == 0) {
            System.out.println(asf);
            res.add(asf);
            return;
        }

        subsequence(str.substring(1), asf + str.charAt(0), res);
        subsequence(str.substring(1), asf, res);
    }

    public static void mazePath(int startingRowIdx, int startingColIdx, int endingRowIdx,
            int endingColIdx, String asf, ArrayList<String> res) {

        // Invalid place.
        if (startingRowIdx > endingRowIdx || startingColIdx > endingColIdx) {
            return;
        }

        // My destination point.
        if (startingRowIdx == endingRowIdx && startingColIdx == endingColIdx) {
            System.out.println(asf);
            res.add(asf);
            return;
        }

        mazePath(startingRowIdx, startingColIdx + 1, endingRowIdx,
                endingColIdx, asf + "H", res);

        mazePath(startingRowIdx + 1, startingColIdx + 1, endingRowIdx,
                endingColIdx, asf + "D", res);

        mazePath(startingRowIdx + 1, startingColIdx, endingRowIdx,
                endingColIdx, asf + "V", res);
    }

    public static void boardPath(int sp, int ep, String asf) {
        if (sp == ep) {
            System.out.println(asf);
            return;
        }

        for (int dice = 1; dice <= 6; dice++) {
            if (sp + dice <= ep) {
                boardPath(sp + dice, ep, asf + dice);
            }
        }
    }

    public static void mazePathMultiJump(int startingRowIdx, int startingColIdx, int endingRowIdx,
            int endingColIdx, String asf) {

    }

    // Leetcode 39: https://leetcode.com/problems/combination-sum/description/
    // Leetcode 40: https://leetcode.com/problems/combination-sum-ii/description/
    // Leetcode 17:
    // https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
    // Leetcode 216: https://leetcode.com/problems/combination-sum-iii/description/
    // Leetcode 377: https://leetcode.com/problems/combination-sum-iv/description/

}
