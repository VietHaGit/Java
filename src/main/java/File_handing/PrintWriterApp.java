package File_handing;

import java.io.*;

public class PrintWriterApp {
    public static void main(String[] args)  throws  IOException{
//PrintWriter1();
        PrintRead();
    }
    public static void PrintWriter1() throws IOException {
        File file = new File("src/main/resources/file8.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("Some String");
        printWriter.println("Hello");
        printWriter.close();
    }

    public static void PrintRead() throws IOException {
        File file = new File("src/main/resources/file8.txt");
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
