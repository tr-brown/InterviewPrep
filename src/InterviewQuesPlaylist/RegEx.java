package InterviewQuesPlaylist;

//can remove all characters that are not alphanumberic with regex and method
//can remove whitespace

public class RegEx {
    public static void alphaNumStr(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }

    public static void removeWhitespace(String str) {
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
