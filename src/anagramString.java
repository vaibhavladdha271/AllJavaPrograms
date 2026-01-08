import java.util.Arrays;

public class anagramString {
    public static void main(String[] args) {
        String s="silent";
        String s1="netils";
        anagramStringUsingForLoop(s,s1);
    }

    private static void anagramStringUsingForLoop(String s, String s1) {
        boolean isAnagram=false;
        if(s.length()!=s1.length()){
            System.out.println("Not an angram string");
        }
        char ch[]=s.toCharArray();
        char ch1[]=s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<s.length();i++){
            if(ch[i]==ch1[i]){
                isAnagram=true;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Both strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
    }
}
