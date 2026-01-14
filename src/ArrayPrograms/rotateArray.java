package ArrayPrograms;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int a[]={3,4,5,6};
        int n=3;
        int length=a.length;
        int[] rotated=new int[length];
        for(int i=0;i<a.length;i++){
            rotated[(i+n)%length]=a[i];
        }
        System.out.println(Arrays.toString(rotated));
    }
}
