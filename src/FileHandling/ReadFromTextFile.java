package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTextFile {

    public static void readFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
    public static void readWithDelimiter(String file) {
        try {
            File testData = new File(file);
            Scanner scan = new Scanner(testData);

            //delimiter is char used to separate values in a string
            scan.useDelimiter(",");

            while(scan.hasNext()) {
                String title = scan.next();
                String category = scan.next();
                String runningTime = scan.next();
                String year = scan.next();
                String price = scan.next();

                System.out.println(title + "\n" + category + "\n" + runningTime + "\n" + year + "\n" + price);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
