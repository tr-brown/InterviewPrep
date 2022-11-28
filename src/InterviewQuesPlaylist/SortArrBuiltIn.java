package InterviewQuesPlaylist;


//1. Arrays.parallelSort(arr) - can specify start and stop index for partial sort; uses sort-merge sorting algo - more efficient for larger data
//2. Arrays.sort(arr) - can specify start and stop index for partial sort and reverse sort; sorts data sequentially;
    //a. this can also reverse sort by adding Arrays.sort(a, Collections.reverseOrder())...
//      however must use Integer rapper class - ex Interger arr[];

import java.util.Arrays;

public class SortArrBuiltIn {
    public static void parallelSort(int[] arr) {
        Arrays.parallelSort(arr);
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
