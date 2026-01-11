public class firstAlphabetsOfWord {
    public static void main(String[] args) {
        String input="My name is Vaibhav";
        String words[]=input.split(" ");
        String firstCharacterOfWord=null;
        for(int i=0;i<words.length;i++){
//            firstCharacterOfWord=firstCharacterOfWord+
            System.out.print(words[i].charAt(0)+ " ");
        }
//        System.out.println(firstCharacterOfWord);

    }
}
