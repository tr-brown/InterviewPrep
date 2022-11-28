package InterviewQuesPlaylist;

//factorial: a function that multiplies a number by every number below it - ex: 5! = 5*4*3*2*1

//1. set factorial num to 1 bc multiplication
//2. create a loop that goes either back or forward in range of 1 and num
//3. for each loop, multiply factorial by num in the range

public class Factorial {
    public static void factorial(int num) {
        int factorial = 1;

        for (int i = num; i >=1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
