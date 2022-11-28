package InterviewQuesPlaylist;
//https://www.youtube.com/watch?v=3vbizK6KzaU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa

//swapping two numbers
    //1. can be done by creating a third variable
        //a. save first value in new variable
        //b. reassign first variable with second variable value
        //c. reassign second variable with the now filled third variable value (first variable's original value
    //2. can be done without creating a third variable
        // addition/subtraction or mult/division
            //a. reassign first variable as equal to first variable plus second variable
            //b. reassign second variable as equal to first variable minus second variable
            //c. reassign first variable as first variable (new value from step a) minus second variable (new value from step b)

public class SwapTwoNums {

    public static void swapTwoNumsWithVariable (int n1, int n2) {
        int temp = n1;

        System.out.println("Before....");
        System.out.println("First value: " + n1);
        System.out.println("Second value: " + n2);

        n1 = n2;
        n2 = temp;

        System.out.println("After...");
        System.out.println("First value: " + n1);
        System.out.println("Second value: " + n2);

    }

    public static void swapTwoNumsWithAddSub (int n1, int n2) {
        System.out.println("Before....");
        System.out.println("First value: " + n1);
        System.out.println("Second value: " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;  //original value of n1
        n1 = n1 - n2; //(n1 + n2) - (original n1 value). leaves the original value of n2.

        System.out.println("After...");
        System.out.println("First value: " + n1);
        System.out.println("Second value: " + n2);

    }


}
