package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("filewrite.txt");
            myWriter.write("This is a new file. Yeet!");
            myWriter.close();
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
