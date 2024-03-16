package FileCreation;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) throws IOException{
        File myFile = new File("MyFirstFile.txt");

            if (myFile.createNewFile()) {
                System.out.println("The file is created " + myFile.getName());
            }else if (myFile.exists()){
                System.out.println("File is already exist in the directory");
            }else{
                System.out.println("Unexpected error is occurred");

        }
    }
}
