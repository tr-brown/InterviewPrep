package InterviewQuesPlaylist;

//1. iterate through arr
//2. if num % 2 is 0, even, else odd

public class EvenOddArr {
    public static void evenOddArr(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num + " is equal.");
            } else {
                System.out.println(num + " is not equal.");
            }
        }
    }
}
