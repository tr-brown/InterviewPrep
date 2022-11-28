package Day2;
//5. Write a Java program to find the duplicate values of an array of integer values.

import java.util.Set;

public class Ques5 {

    public static void duplicateValues(int[] values) {

        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; i < values.length; j++) {
                if (values[i] == values[j]) {
                    System.out.println("Duplicate: " + values[i]);
                }
            }

        }
    }
}
