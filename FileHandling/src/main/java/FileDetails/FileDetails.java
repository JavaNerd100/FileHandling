package FileDetails;

import java.io.File;

public class FileDetails {

    public static void main(String[] args) {
        File myfile = new File("MyFirstFile.txt");
        if (myfile.exists()){
            System.out.println("The file name is :" + myfile.getName());
            System.out.println("The absolute path of file is :" + myfile.getAbsolutePath());
            System.out.println("The file is writeable or not ?:" + myfile.canWrite());
            System.out.println("The file is readable or not ?:" + myfile.canRead());
            System.out.println("The length of the file :" + myfile.length());
        }
    }
}
