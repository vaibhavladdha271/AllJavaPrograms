import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class removeDuplicateWordsFromSentence {
    public static void main(String[] args) {
        String input="java is java and java is powerful";
        String word[]=input.split(" ");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(int i=0;i<word.length;i++){
            if (map.containsKey(word[i])) {
                map.put(word[i],map.get(word[i])+1);
            } else {
                map.put(word[i],1);
            }
        }
        for(Map.Entry<String,Integer> set:map.entrySet()){
            if(set.getValue()==1){
              System.out.print(set.getKey()+ " ");
//                input=input.replaceAll(set.getKey(),"");
            }
        }
//        System.out.println(input.trim());
    }
}
