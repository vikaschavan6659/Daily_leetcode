import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.*/
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        // Mapping characters of s and t to their first occurrence indices
        for (Integer i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            mapS.putIfAbsent(charS, i);
            mapT.putIfAbsent(charT, i);
        }

        // Creating lists of indices of characters in s and t
        List<Integer> indicesS = new ArrayList<>(mapS.values());
        List<Integer> indicesT = new ArrayList<>(mapT.values());

        // Checking if the lists are equal
        return indicesS.equals(indicesT);
    }

    public static void main(String[] args) {
        Isomorphic solution = new Isomorphic();

        // Test cases
        String s1 = "egg";
        String t1 = "add";

        String s2 = "foo";
        String t2 = "bar";

        String s3 = "paper";
        String t3 = "title";

        System.out.println("Isomorphic for '" + s1 + "' and '" + t1 + "': " + solution.isIsomorphic(s1, t1));
        System.out.println("Isomorphic for '" + s2 + "' and '" + t2 + "': " + solution.isIsomorphic(s2, t2));
        System.out.println("Isomorphic for '" + s3 + "' and '" + t3 + "': " + solution.isIsomorphic(s3, t3));
    }
}
