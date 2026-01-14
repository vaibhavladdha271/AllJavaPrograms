package ArrayPrograms;

import java.util.Arrays;

public class shiftZeroToLeftUsingSwapping {
    public static void main(String[] args) {
//        int a[]={0, 1, 2, 0, 3, 0, 4, 0};
        int a[]={0, 1, 0, 2, 3};
        int left=0,right=a.length-1;
        int temp=0;
        while(left<right){
            if(a[left]!=0 && a[right]==0){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            } else if(a[left]!=0 && a[right]!=0){
                temp=a[left];
                a[left]=0;
                a[right+1]=temp;
            }
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}
