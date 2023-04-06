package File_handing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadApp {
    public static void main(String[] args) throws IOException {
   BufferedRead1();
    }
    public static void BufferedRead1() throws IOException {
        File file = new File("src/main/resources/fileTest7.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        fileReader.close();
        bufferedReader.close();


    }
}
