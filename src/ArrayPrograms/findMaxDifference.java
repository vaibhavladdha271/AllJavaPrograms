package ArrayPrograms;

public class findMaxDifference {
    public static void main(String[] args) {
        int[] arr={10,90,2,40,1,25};
        int smallest= Integer.MAX_VALUE;
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            } else if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Max difference :"+(largest-smallest));
    }
}
