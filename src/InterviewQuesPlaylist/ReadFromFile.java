package InterviewQuesPlaylist;

//1. filereader and bufferedreader clases
//2.  scanner and file classes with loop
//3.  scanner and file classes with usedelimiter ("\\Z" - The end of the input but for the final terminator, if any) regex

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void readFile() {
        File newFile = new File("fb.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(newFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        scan.useDelimiter("\\Z");
        System.out.println(scan.next());
    }
}
