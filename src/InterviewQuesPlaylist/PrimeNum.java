package InterviewQuesPlaylist;

//prime num: whole num > 1 whose only factors are 1 and itself

//1. create a counter
//2. make sure number is greater than 1, if not then auto not prime
//3. check range of number from 1 up to and including num
    //a. check if each num is divisible by num
    //b. if so, increment counter
//4. if counter is 2 after going through range, num is prime
//5. if counter is something other than two after going through range, num is not prime

public class PrimeNum {
    public static void primeNum(int num) {
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}
