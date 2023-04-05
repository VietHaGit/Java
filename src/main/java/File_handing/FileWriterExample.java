package File_handing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriterExample {
    public static void main(String[] args) {
       try {
           File file = new File("src/main/resources/fileTest.txt");
           FileWriter fileWriter =  new FileWriter(file);
//           ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileWriter);
           fileWriter.write("Ghi du lieu bang character");
           fileWriter.close();
       }
       catch (IOException exception){
           System.out.println("loi ghi file" + exception);
       }
    }
}
