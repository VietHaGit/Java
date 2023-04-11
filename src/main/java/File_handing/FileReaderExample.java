package File_handing;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
      try {
          File file = new File("src/main/resources/fileTest.txt");
          FileReader fileReader = new FileReader(file);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line;
          while ((line = bufferedReader.readLine()) != null){
              System.out.println(line);
          }
          fileReader.close();
          bufferedReader.close();
      }
      catch (IOException exception){
          System.out.println("Loi doc file" + exception);
      }
        }

}
