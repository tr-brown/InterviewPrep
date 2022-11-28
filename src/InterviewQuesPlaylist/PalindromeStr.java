package InterviewQuesPlaylist;

//1. reverse the string
//2. check if original string is equal to reversed str

public class PalindromeStr {

    public static void palindromeStr(String str){
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char letter = str.charAt(i);
            newStr += letter;
        }

        if (str.equalsIgnoreCase(newStr)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is NOT a palindrome");
        }


    }
}
