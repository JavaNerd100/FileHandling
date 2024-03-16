package FileUpdation;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdation {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("MyFirstFile.txt");
        fileWriter.write("Spring Boot helps you to create stand-alone, production-grade Spring-based applications that you can run. We take an opinionated view of the Spring platform and third-party libraries, so that you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.\n" +
                "You can use Spring Boot to create Java applications that can be started by using java -jar or more traditional war deployments.\n" +
                "Our primary goals are:\n" +
                "Provide a radically faster and widely accessible getting-started experience for all Spring development.\n" +
                "Be opinionated out of the box but get out of the way quickly as requirements start to diverge from the defaults.\n" +
                "Provide a range of non-functional features that are common to large classes of projects (such as embedded servers, security, metrics, health checks, and externalized configuration).\n" +
                "Absolutely no code generation (when not targeting native image) and no requirement for XML configuration.");
        fileWriter.close();
        System.out.println("Content is successfully wrote to the file ");
    }

    /**
     * There are many available classes in the Java API that can be used to read
     * and write files in Java: FileReader, BufferedReader, Files, Scanner, FileInputStream,
     * FileWriter, BufferedWriter, FileOutputStream, etc.
     * Which one to use depends on the Java version you're working with and whether you need to read bytes or characters, and the size of the file/lines etc.
     */
}
