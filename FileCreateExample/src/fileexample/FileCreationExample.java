package fileexample;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        File myFile = new File("/Users/kurisu/Desktop/test/myFile.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ioe){

        }
    }
}
