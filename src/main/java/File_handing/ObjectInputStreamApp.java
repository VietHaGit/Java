package File_handing;
import java.io.*;
public class ObjectInputStreamApp {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/fileTest124.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        System.out.println("The Object has been read from the file" + object.toString());
        objectInputStream.close();
    }
}


