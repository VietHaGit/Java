package File_handing;

import javax.imageio.IIOException;
import java.io.*;
import java.io.ObjectInputStream;

public class FileOutputStreamApp {
    public static void main(String[] args) throws Exception {
        FileOutputStream1();

    }
    public static void FileOutputStream1() throws Exception{
        String Str = "Hello";
        File file = new File("src/main/resources/file9.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bytes = Str.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

}
