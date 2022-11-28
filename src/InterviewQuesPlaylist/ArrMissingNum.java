package InterviewQuesPlaylist;

//find the missing number from an array of consecutive nums

//1. find highest and lowest value in arr to get range
//2. sum the arr - sumarr1
//3. loop through range and find sum of list if num in range was still there - sumarr2
//4. subtract sumarr2 from sumarr1 to get missing number from the range

import java.util.Arrays;

public class ArrMissingNum {
    public static void arrMissingNum(int[] values) {
        Arrays.sort(values);

        int sum1 = 0;
        for (int num : values) {
            sum1 += num;
        }
        System.out.println("Sum1: " + sum1);

        int sum2 = 0;
        for (int i = values[0]; i <= values[values.length-1]; i++) {
            sum2 += i;

        }
        System.out.println("Sum2: " + sum2);

        int missingNum = sum2 - sum1;
        for (int val : values) {
            System.out.println(val);
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println("Missing number: " + missingNum);
    }
}
