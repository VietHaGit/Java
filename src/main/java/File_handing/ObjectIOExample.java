package File_handing;

import javax.management.ObjectName;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOExample {
    private static final String filepath="src/main/resources/file18.txt";
    public static void main(String[] args) throws Exception {
        ObjectIOExample objectIOExample = new ObjectIOExample();
       User user = new User("John1","Frost",24);
       objectIOExample.WriteObjectToFile(filepath,user);
       User user1 = (User) objectIOExample.ReadObjectFromFile(filepath);
       System.out.println(user1);

    }
    public void WriteObjectToFile(String filepath,Object serObj) throws Exception{
        FileOutputStream fileOut = new FileOutputStream(filepath);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(serObj);
        System.out.println("The Object  was succesfully written to a file");
        fileOut.close();
        objectOut.close();
    }
    public Object ReadObjectFromFile(String filepath) throws Exception{
        FileInputStream fileIn = new FileInputStream(filepath);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        Object obj = objectIn.readObject();
        System.out.println("The Object has been read from the file");
        objectIn.close();
        return obj;
    }
}
