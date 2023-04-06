package File_handing;

import java.io.*;

public class DataOutputExample {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("src/main/resources/fileTest2.txt",true);
            DataOutputStream dataOutputStream = new DataOutputStream(file);
//            dataOutputStream.writeInt(4);
            dataOutputStream.writeInt(5);
            file.close();
            dataOutputStream.close();
            System.out.println("done");
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
