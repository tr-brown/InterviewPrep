package InterviewQuesPlaylist;

//1. create a count variable
//2. while number is greater than 0, remove last digit by diviing num by 10 and keep count for each digit removed

public class CountDigits {

    public static void countDigits(int num) {

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Digits: " + count);

    }
}
