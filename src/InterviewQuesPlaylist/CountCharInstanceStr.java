package InterviewQuesPlaylist;

//1. get the total length of string
//2. use replace method to replace all instances of the letter your looking for in the string withempty quotes
//3. get the total length of that new string
//4. sub the new string length from the original str length to get the total amount of occurrence of letter in the str

public class CountCharInstanceStr {
    public static void charInstance(String str, String letter) {

        int str1 = str.length();

        int str2 = str.replace(letter, "").length();

        int numOfLet = str1 - str2;

        System.out.println("Number of " + letter + ": " + numOfLet);
    }


}
