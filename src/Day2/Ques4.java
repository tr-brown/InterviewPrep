package Day2;
//4. Write a Java program that takes a number between 1 and 7 and displays the name of the weekday

import java.util.Scanner;

public class Ques4 {

    public static void dayofWeek() {
        System.out.println("Please enter a number between 1 and 7.");
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You did not enter a proper value.");

        }
    }
}
