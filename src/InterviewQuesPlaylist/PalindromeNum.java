package InterviewQuesPlaylist;

//palindrome -check if num is same if reading backwards orv forwards (ie: 12321)

//1. reverse the number
//2. check if reveresed number is same as original number
//3. if yes, palindrome, if not, not a palindrome

import java.util.Scanner;

public class PalindromeNum {

    public static void palindromeNum() {
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int orgNum = num;

        //reverse num
        int reversedNum = 0;

        while (num != 0 ) {
            reversedNum = reversedNum * 10 + num % 10;
            num = num / 10;
        }

        if (orgNum == reversedNum) {
            System.out.println("Palindrome: " + orgNum + " is \t" + reversedNum);
        } else {
            System.out.println("Not a palindrome: " + orgNum + " is not\t" + reversedNum);
        }
    }
}
