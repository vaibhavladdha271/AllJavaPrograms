import java.util.HashMap;
import java.util.LinkedHashMap;

public class reverseString {

    public static void reverseString(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i)+ "");
        }
    }
    public static void main() {
        String s="Vaibbhav";
        String s1="My name is Vaibhav";
        reverseString(s);
        System.out.println();
        reverseWordsOfString(s1);
        System.out.println();
        countOfNumberOfCharacters(s);
        System.out.println();
        countOfNumberOfCharactersUsingArray(s);
        System.out.println();
        firstRepeatingCharacter(s);
        System.out.println();
        lastRepeatingCharacter(s);
    }

    private static void lastRepeatingCharacter(String s) {
        char lastRepeatingCharacter = 0;
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            } else {
                hashMap.put(s.charAt(i),1);
            }

        }
        for(char c: hashMap.keySet()){
            
            if(hashMap.get(c)>1){
                lastRepeatingCharacter=c;
            }
        }
        System.out.println("Last repeating character: "+lastRepeatingCharacter);
    }

    private static void firstRepeatingCharacter(String s) {
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            } else {
                hashMap.put(s.charAt(i),1);
            }

        }
        for(char c: hashMap.keySet()){
            if(hashMap.get(c)>1){
                System.out.println("First repeating character: "+c);
                break;
            }
        }
    }

    private static void countOfNumberOfCharactersUsingArray(String s) {
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch]!=0){
                System.out.print(ch+":"+freq[ch]+ " ");
                freq[ch]=0;
            }

        }
    }

    private static void countOfNumberOfCharacters(String s) {
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            } else {
                hashMap.put(s.charAt(i),1);
            }

        }
        System.out.println(hashMap);
    }

    private static void reverseWordsOfString(String s1) {
        String input[]=s1.split(" ");
        for(int i=input.length-1;i>=0;i--){
            System.out.print(input[i]+ " ");
        }
    }
}
