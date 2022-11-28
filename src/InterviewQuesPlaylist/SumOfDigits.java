package InterviewQuesPlaylist;

//1. create sum variable;
//2. capture last value by num % 10;
//3. add that value to sum
//4. remove the last value by num /10
// 5. do this until num is not > 0

public class SumOfDigits {
    public static void sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
 }
