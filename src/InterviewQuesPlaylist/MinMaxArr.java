package InterviewQuesPlaylist;

//1. set first value of arr as min or max
//2. iterate through arr and check if each value is greater than (if max) or less than (if min) the current set value
//3. if so set that num as new value

public class MinMaxArr {
    public static void minArr(int[] arr) {
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum number: " + min);

    }

    public static void maxArr(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);

    }
}
