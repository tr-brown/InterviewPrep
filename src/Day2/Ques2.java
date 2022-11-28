package Day2;

//2. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise

public class Ques2 {

    public static void equalNumbers (int one ,int two, int three, int four) {
        if (one == two &&
                two == three &&
                three == four) {
            System.out.println("All are equal.");
        } else {
            System.out.println("The four numbers are not the same.");
        }
    }
}
