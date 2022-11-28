package Day2;
//6. Write a Java program to compare a given string to a given character sequence (check if char sequence exists)


public class Ques6 {

    public static void compareStr(String str, String subStr) {
        if (str.contains(subStr)) {

            System.out.println("Substring is in the string.");
        } else {
            System.out.println("Substring is NOT in the string.");
        }
    }
}
