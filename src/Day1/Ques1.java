package Day1;//Take three numbers from the user and print the greatest number.


import java.util.Scanner;

public class Ques1 {

    public static void greatestNum(int one, int two, int three) {
        int greatest = one;

        if (two > greatest) {
            greatest = two;
        }
        if (three > greatest) {
            greatest = three;
        }
        System.out.println("Greatest: " + greatest);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter num 2");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter num 3");
        int num3 = Integer.parseInt(scan.nextLine());

        greatestNum(num1,num2,num3);

    }
}