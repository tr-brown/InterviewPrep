package Day1;//Write a Java program to sum values of an array.

import java.util.ArrayList;
import java.util.Arrays;

public class Ques2 {

    public static void sumArray(ArrayList<Integer> listy) {
        int count = 0;
        for (int num : listy) {
            count += num;
        }
        System.out.println("Sum of list: " + count);
    }


    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(4,6,3));
        sumArray(newArr);

    }


}
