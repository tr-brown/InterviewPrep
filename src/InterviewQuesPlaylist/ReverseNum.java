package InterviewQuesPlaylist;

//reverse a num can be done via algorithm or with class methods
    //1. algorithm within a while loop
        //a. create an int variable and set to 0 that will hold the reversed int;
        //b. capture the last digit of the number: number%10
        //c. add the last digit to the reversed int variable;
        //d. divide the number by 10 to remove the last digit from the loop
        //e. continue until the revered int value is 0;

    //2. StringBuilder or StringBuffer class and methods - will be using string builder here
        //a. create a new stringbuilder
        //b. use stringbuilder append method
        //c. use stringbuilder reverse method

import java.util.Scanner;

public class ReverseNum {

    public static void reverseNumAlgo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.parseInt(scan.nextLine());

        System.out.println("Original num: " + num);

        int reversedNum = 0;
        int lastDigit = num % 10;

        while (num != 0) {
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
            lastDigit = num % 10;
        }
        System.out.println("Reversed num: " + reversedNum);
    }

    public static void reverseNumStrBdr() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.parseInt(scan.nextLine());

        System.out.println("Original num: " + num);

        StringBuilder newStr = new StringBuilder();
        newStr.append(num);
        StringBuilder reversedStr = newStr.reverse();

        System.out.println("Reversed num: " + reversedStr);
    }
}
