/*
Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays.
If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
*/

import java.util.ArrayList;
import java.util.List;

public class MinCommanArrays {
    public static int getCommon(List<Integer> nums1, List<Integer> nums2) {
        int i = 0;
        int j = 0;
        int com = -1;

        while (i < nums1.size() && j < nums2.size()) {
            if (nums1.get(i) == nums2.get(j)) {
                com = nums1.get(i);
                break;
            } else if (nums1.get(i) < nums2.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return com;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);

        int com = getCommon(nums1,nums2);

        System.out.print(com);

    }
}
