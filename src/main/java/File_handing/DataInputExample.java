package File_handing;
import java.io.*;

public class DataInputExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/fileTest2.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            int n = dataInputStream.readInt();
            double m = dataInputStream.readDouble();
            fileInputStream.close();
            dataInputStream.close();
            System.out.println("So nguyen" + n);
            System.out.println("So thuc" + m);
        }
        catch (IOException  exception){
            exception.printStackTrace();
        }

    }
}
