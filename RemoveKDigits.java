import java.util.*;

public class RemoveKDigits {

    public static String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // Remove remaining k digits from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Remove leading zeros
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result.reverse();

        // Removing leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "1432219";
        int k1 = 3;
        System.out.println("After removing " + k1 + " digits from " + num1 + ": " + removeKdigits(num1, k1));

        String num2 = "10200";
        int k2 = 1;
        System.out.println("After removing " + k2 + " digit from " + num2 + ": " + removeKdigits(num2, k2));

        String num3 = "10";
        int k3 = 2;
        System.out.println("After removing " + k3 + " digits from " + num3 + ": " + removeKdigits(num3, k3));

        String num4 = "4321";
        int k4 = 2;
        System.out.println("After removing " + k4 + " digits from " + num4 + ": " + removeKdigits(num4, k4));
    }
}
