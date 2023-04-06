package File_handing;

import java.io.*;

public class BufferedWriterApp {
    public static void main(String[] args) throws IOException {
             Buffered();
    }
    public static void Buffered() throws IOException {
        File file = new File("src/main/resources/fileTest7.txt");
        FileWriter fio = new FileWriter(file,true);
        BufferedWriter buo = new BufferedWriter(fio);
//        buo.write("Thanh Ha Nguyen");
        buo.write("Hello");
        buo.flush();
        buo.close();
    }
}
