package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void createFile(String file) {
        try{
            File newObj = new File(file);
            if (newObj.createNewFile()) {
                System.out.println("File created -- shakepeareSonnet8.txt");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }

}
