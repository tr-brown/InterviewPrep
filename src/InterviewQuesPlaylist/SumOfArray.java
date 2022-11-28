package InterviewQuesPlaylist;

//1. iterate through array
//2. add each value to sum variable

public class SumOfArray {
    public static void sumOfArray(int[] values) {
        int sum = 0;

        for (int num : values) {
            sum += num;
        }
        System.out.println(sum);
    }
}
