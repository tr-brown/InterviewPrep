package Day1;//Write a Java program to reverse a string

public class Ques4 {

    public static void reverseString(String str) {
        String newStr = "";

        for (int i = str.length() - 1; i >=0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        reverseString("Tiara");

    }
}
