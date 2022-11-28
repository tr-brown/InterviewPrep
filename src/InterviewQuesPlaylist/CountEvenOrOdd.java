package InterviewQuesPlaylist;

//1. create count for even and odd digits
//2. capture the last digit by num%10
//3. check if num is even or odd and increment correct counter
//4. remove the last digit of number  via num / 10
//5. keep doing this until num is not > 0

public class CountEvenOrOdd {
    public static void countEvenOdd(int num) {

        int even = 0;
        int odd = 0;

        while(num > 0) {
            int lastDigit = num % 10;

            if (lastDigit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);

    }
}
