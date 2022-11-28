package Day2;
//1. Write a Java program that reads a text file as input and prints all the lines that start with a vowel

//find or create a text file
//bring in the text file to be read by scanner
//create a delimiter that only reads lines that start with a vowel.
//print each qualifying line until reach end of file
//close file
//try catch blocks for error handling


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ques1 {

    public static void readLinesWithVowels(String readFile) {

        try {
            File file = new File(readFile);
            Scanner scan = new Scanner(file);

            while (scan.hasNext()) {
                String line = scan.next();
                char firstLet = line.toUpperCase().charAt(0);
                if (firstLet == 'A' || firstLet == 'E' || firstLet == 'I' || firstLet == 'O' || firstLet == 'U' ) {
                        System.out.println(line);
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
