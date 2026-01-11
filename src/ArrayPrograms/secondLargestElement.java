package ArrayPrograms;

public class secondLargestElement {

    public static void main(String[] args) {
        int a[]={10,40,100,50,20,60};
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
                if(a[i]>largest) {
                    secondLargest=largest;
                    largest = a[i];
                } else if(a[i]>secondLargest && a[i]!=largest){
                    secondLargest=a[i];
                }
            }
        System.out.println("Largest number: "+largest);
        System.out.println("Second largest: "+secondLargest);
        }

    }