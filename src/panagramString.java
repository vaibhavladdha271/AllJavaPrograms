import java.sql.SQLOutput;

public class panagramString {
    public static void main(String[] args) {
        String input = "Sphinx of black quartz, judge my vow";
        boolean isAnagram=true;
        if(input.length()<26 || input.isEmpty()) {
            isAnagram = false;
        } else {
            for (char c = 'a'; c <= 'z'; c++) {
                if(input.indexOf(c)==-1){
                    isAnagram=false;
                }
            }
        }
//        isAnagram=true;
        if(isAnagram){
            System.out.println("String is panagram");
        } else {
            System.out.println("String is not panagram");
        }

    }

}
