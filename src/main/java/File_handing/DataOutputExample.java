package File_handing;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("src/main/resources/fileTest2.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(file);
            dataOutputStream.writeInt(100);
            dataOutputStream.writeDouble(59);
            file.close();
            dataOutputStream.close();
            System.out.println("done");
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
