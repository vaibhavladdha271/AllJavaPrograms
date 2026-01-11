public class StringContainsAnotherString {

    public static void main(String[] args) {
        String s="abcd";
        String s1="cdab";
        if((s+s).contains(s1)){
            System.out.println("Rotated string is available");
        } else {
            System.out.println("Rotated string is not available");
        }
    }
}
