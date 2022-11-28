package InterviewQuesPlaylist;

//reverse a string
    //1. create an empty string
    //2. create a for loop
        //a. start loop at last value (str.length - 1)
        //b. stop loop when i >= 0;
        //c. decrement the loop
        //d. add each char at the relevant index to the empty str

public class ReverseStr {

    public static void reverseStr(String str) {
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
             char letter = str.charAt(i);
             newStr += letter;
        }
        System.out.println("Reversed string: " + newStr);
    }
}
