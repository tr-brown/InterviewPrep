package InterviewQuesPlaylist;

//1. isolate each word
    //a. split string by space into a str arr
//2. reverse each word
    //a. loop through arr to look at leach word
    //b. create empty string of reverese word and add each word to it - look at reversestr
    //c. as you loop through arr, += the reversed char into that formly empty string
//3. add them back into a single str
    //a. after reversed char loop, but with reversed word loop in an empty reversed string, add reversed word value + space.


public class ReverseEachWordStr {
    public static void reverseStr(String str) {
        String[] words = str.split(" ");
        String reversedStr = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            reversedStr = reversedStr + reversedWord + " ";
        }
        System.out.println(reversedStr);
    }

}
