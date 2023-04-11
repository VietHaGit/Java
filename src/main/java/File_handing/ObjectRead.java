package File_handing;

import java.io.*;
import java.io.ObjectInputStream;

public class ObjectRead {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("src/main/resources/file6.txt");
            ObjectInputStream obo =new ObjectInputStream(fi);
            Object object = obo.readObject();
            System.out.println(object);
            obo.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
