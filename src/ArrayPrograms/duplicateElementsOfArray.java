package ArrayPrograms;

public class duplicateElementsOfArray {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,2,4};
        int[] b = new int[0];
        int index=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    b[index]=a[j];
                }
            }
        }
    }
}
