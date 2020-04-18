package bufferedreaderexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {//比scanner的好处是 synchronized 线程安全 fast 适合long section text
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){

        }


    }
}
