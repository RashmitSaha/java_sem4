import java.lang.*;

class DeleteElement {
    /**
     * Given a string and an index m, return the string with the mth character
     * removed.
     *
     * @param str The input string.
     * @param m   The index of the character to remove (1-based index).
     * @return The string with the mth character removed.
     * Returns null if the input string is null or m is not a valid index.
     * For example:
     * delete("hello", 1) == "ello"
     * delete("hello", 4) == "helo"
     * delete("hello", 5) == "hell"
     */
    public String delete(String str, int m) {
        // Check for null string
        if (str == null) {
            return null;
        }

        // Get the length of the string.
        int n = str.length();

        // Check if m is a valid index.  m is 1-based, so it must be
        // between 1 and n, inclusive.
        if (m < 1 || m > n) {
            return null;
        }

        // If m is 1, return the substring from index 1 to the end.
        if (m == 1) {
            return str.substring(1);
        }
        // If m is n, return the substring from index 0 to n-1.
        if (m == n) {
            return str.substring(0, n - 1);
        }

        // Otherwise, split the string into two parts and concatenate them.
        String left = str.substring(0, m - 1); // from 0 to m-2
        String right = str.substring(m);     // from m to the end

        return left + right;
    }
    
    public static void main(String[] args){
        DeleteElement del = new DeleteElement();
        System.out.println(del.delete("hello",6));
        System.out.println(del.delete("",1));
        System.out.println(del.delete("low",0));
        System.out.println(del.delete("apple",1));
    }
}
