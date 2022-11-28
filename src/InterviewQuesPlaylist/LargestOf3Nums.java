package InterviewQuesPlaylist;

//find largest of 3 nums - can use traditional if statements (if a > b && a > c... else if (id)...else c) or ternary operator

//ternary
    //1. find largest of first two numbers and save as variable
    //2. take largest and check if larger than third number

public class LargestOf3Nums {
    public static void largestof3Nums(int num1, int num2, int num3) {
        int largest = num1 > num2 ? num1: num2;
        int largest2 = num3 > largest ? num3 : largest;

        System.out.println("Largest num is: " + largest2);
    }
}
