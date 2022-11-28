package InterviewQuesPlaylist;

//1.iterate through list and check each value against the num
//2. create boolean to keep track if found or not


public class LinearSearch {
    public static void linearSearch(int[] arr, int num) {
        boolean found = false;
        for (int val : arr) {
            if (val == num) {
                System.out.println("Value found");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Value not found");
        }

    }
}
