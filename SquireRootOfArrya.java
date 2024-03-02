import java.util.Arrays;

public class SquireRootOfArrya {

        public static void main(String[] args) {
            int[] vikas = {1, 2, 3, 45, 6, -5};
            Solution solution = new Solution();
            int[] array = solution.sortedSquares(vikas);
            System.out.print(Arrays.toString(array)); // Corrected to print the array contents
        }
    }

    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] A = nums;
            for (int i = 0; i < A.length; i++)
                A[i] = A[i] * A[i];
            Arrays.sort(A);
            return A;
        }

}
