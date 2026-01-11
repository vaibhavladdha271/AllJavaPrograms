package ArrayPrograms;

import java.util.Arrays;

public class shiftZeroToRight {
    public static void main(String[] args) {
        int a[]={0, 1, 2, 0, 3, 0, 4, 0};
        int b[]=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[index]=a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
