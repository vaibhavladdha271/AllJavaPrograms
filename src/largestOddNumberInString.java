import java.util.ArrayList;

public class largestOddNumberInString {
    public static void main(String[] args) {
        String s="5348";
        int ind = -1;

        // Find the last odd digit in the string
        int i;
        for (i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }

        // Return empty string if no odd digit was found
        if (ind == -1) System.out.println("");

        // Skip leading zeroes up to the odd digit
        i = 0;
        while (i <= ind && s.charAt(i) == '0') i++;

        // Return substring from first non-zero to odd digit
        String result=s.substring(i, ind + 1);
        System.out.println(result);
    }
}
