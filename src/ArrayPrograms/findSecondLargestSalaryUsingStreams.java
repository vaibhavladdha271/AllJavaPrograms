package ArrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class findSecondLargestSalaryUsingStreams {
    public static void main(String[] args) {
        int a[]={54000,50000,67000,35000,70000};
        int b=Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(b);
    }
}
