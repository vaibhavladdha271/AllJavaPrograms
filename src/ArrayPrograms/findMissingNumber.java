package ArrayPrograms;

import java.util.Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr={6,4,7,3,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int start=arr[i];
            int end=arr[i+1];
            for(int j=start+1;j<end;j++){
                System.out.println(j);
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
}
