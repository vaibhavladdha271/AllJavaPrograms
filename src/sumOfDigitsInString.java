public class sumOfDigitsInString {
    public static void main(String[] args) {
        String input="a12b3c4";
        int sum=0,num=0;
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c>='0' && c<='9'){
                num=num*10+(c-'0');
            } else {
                sum=sum+num;
                num=0;
            }
        }
        System.out.println(sum);
    }
}
