package InterviewQuesPlaylist;

//largest values bubble up towards the end during the passes
//n-1 total passes, which is the total num of elements in the array minus 1

//1. create nested loop
//2. outer loop is num of passes (n-1)
//3. inner loop is iteration of each pass
//4. if later value is less than earlier value, swap places by switching out values - see swaptwonums for ways.

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        System.out.println("Array before sort: " + Arrays.toString(arr));

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted string: " + Arrays.toString(arr));
    }
}
