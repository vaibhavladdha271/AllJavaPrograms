package ArrayPrograms;

import java.util.HashMap;

public class getCountOfEachVowelInString {
    public static void main(String[] args) {
        String s="Automation covered by Vaibhav is unverified";
        char c[]=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<c.length;i++){
            if("aeiouAEIOU".indexOf(c[i])!=-1){
                if(hm.containsKey(c[i])){
                    hm.put(c[i],hm.get(c[i])+1);
                } else {
                    hm.put(c[i],1);
                }
            }
        }
        System.out.println(hm);
    }
}
