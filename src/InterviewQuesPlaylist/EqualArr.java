package InterviewQuesPlaylist;

//check if arrays are equal

//1. use arrays equals method to check two arrays

//2. create 2 arrays
//a. check if both are the same length
//b. check if each value at the same index is the same


public class EqualArr {
    public static void equalArr(int[] arr1, int[] arr2) {
        boolean equal = true;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                }
            }
        } else {
            equal = false;
        }
        if (equal) {
            System.out.println("Arrays are equal.");
        }
        else {
            System.out.println("Arrays are not equal.");
        }
    }
}
