package InterviewQuesPlaylist;

//a series of numbers in which each number is the sum of the two preceding numbers
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34

//1. the first two numbers are assigned as the starting point (n1 and n2)
//2. create a sum variable
//3. create a loop that starts at index 2 (third num) and goes up to desired stopping point
    //within the loop, num 1 is n2 and num 2 becomes sum
    //print sum after each loop

public class Fibonacci {

    public static void fibonacci() {
        int sum;
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + "\t" + n2);

        for (int i = 2; i < 10; i ++) {
            sum = n1 + n2;
            System.out.print("\t" + sum);
            n1 = n2;
            n2 = sum;

        }
    }
}
