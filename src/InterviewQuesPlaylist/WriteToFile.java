package InterviewQuesPlaylist;

//1. create new file with filewriter
//2. write to file with bufferedwriter w/ write method
//3. close file

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile() {
        FileWriter file = null;
        try {
            file = new FileWriter("fb.txt");
        BufferedWriter br = new BufferedWriter(file);
            br.write("Yo sup.");
            br.write("This is the next sentence.");
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }





    }
}
