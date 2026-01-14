package ArrayPrograms;

public class findUniqueNumberUsingXORTechnique {
    public static void main(String[] args) {
        int a[]={1,2,1,4,2};
        int result=0;
        for(int i=0;i<a.length;i++){
            result=result^a[i];
        }
        System.out.println(result);
    }
}
