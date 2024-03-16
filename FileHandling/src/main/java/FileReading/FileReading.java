package FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) throws FileNotFoundException {
        File myfile = new File("MyFirstFile.txt");
        Scanner scanner = new Scanner(myfile);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
