public class findLongestSubstring {
    public static void main(String[] args) {
        String input = "Vaibhav";
        String longestSubstring = "";
        char c[] = input.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < input.length(); i++) {
            if (longestSubstring.indexOf(c[i]) == -1) {
                longestSubstring += c[i];
                if (longestSubstring.length() > maxLength) {
                    maxLength = longestSubstring.length();
                }
            }
            else {break;}
        }
        System.out.println("Longest substring :"+longestSubstring);
        System.out.println("Longest substring length: "+maxLength);
    }
}
