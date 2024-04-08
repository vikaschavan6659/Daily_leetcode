/*Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.*/
public class LengthOfLastString {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Length of last word in '" + s1 + "': " + solution.lengthOfLastWord(s1));
        System.out.println("Length of last word in '" + s2 + "': " + solution.lengthOfLastWord(s2));
        System.out.println("Length of last word in '" + s3 + "': " + solution.lengthOfLastWord(s3));

    }
}
