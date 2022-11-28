package Day1;//Write a Java program to find the second largest element in an array.

import java.util.ArrayList;
import java.util.Arrays;

public class Ques3 {

    public static int secondLargest(int[] listy) {
        //iterate through arraylist
        //start off as largest value being first num
        int largest = 0;

        for (int num : listy) {
            //find largest value
            if (num > largest) {
                largest = num;
            }
        } //largest is 9

        //find second largest
        int secondLargest = 0;

        for (int i = 0; i < listy.length; i++) {
            int num = listy[i];
            //want to exclude the largest number, but check if current num is larger than rest of list
            if (num != largest && num > secondLargest) {
                    secondLargest = num;
                }
            }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [] newArr = {6,4,21,9};
        System.out.println(secondLargest(newArr));
    }
}
