package InterviewQuesPlaylist;

//1. start counter at 1
//2. extract every character
//3. whenever there is a space then another character, means a word
//4.

public class CountWordsStr {
    public static void countWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == ' ' && str.charAt(i +1) != ' ') {
                count++;
            }
        }
        System.out.println("Number of words: " + count);
    }
}
