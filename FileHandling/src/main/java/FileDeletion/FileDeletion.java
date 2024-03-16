package FileDeletion;

import java.io.File;

public class FileDeletion {
    public static void main(String[] args) {
        File myFile = new File("MyFirstFile.txt");
        if (myFile.delete()){
            System.out.println("File is successfully deleted");
        }
        else {
            System.out.println("Unexpected error is occurred");
        }
    }
}
