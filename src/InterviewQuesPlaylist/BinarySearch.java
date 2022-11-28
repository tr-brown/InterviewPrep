package InterviewQuesPlaylist;

//1. sort the array
//2. find the mid value
//a. (lowest index + highest index / 2
//3. while lowest index is less than or equal to highest index
//a. check if search value is equal to mid - if so, value found and done
//b. check if search value is less or greater to mid index value
//i. if less, need to search the left half of the array - move the highest index to mid index - 1;
//ii. if greater, need to search the right half of the array - move the lowest to mid index + 1;
//4. if lowest index becomes greater than hightest, means value not found


//there is also an Arrays.binarySearch(arr, searchvalue) method; if value returned is negative, value is not found

public class BinarySearch {
    public static void binarySearch(int[] arr, int val) {
        //first index
        int low = 0;
        //last index
        int high = arr.length - 1;

        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (val == arr[mid]) {
                found = true;
                System.out.println("Value found.");
                break;
            }
            //if value is less than mid, shift the high index left
            if (val < arr[mid]) {
                high = mid - 1;
            }
            //if the value is greater than mid, shift the low index right
            if (val > arr[mid]) {
                low = mid + 1;
            }
        }
        if (!found) {
            System.out.println("Value not found.");
        }
    }
}
