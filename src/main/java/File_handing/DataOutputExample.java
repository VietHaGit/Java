package File_handing;

import java.io.*;

public class DataOutputExample {
    public static void main(String[] args) throws Exception {
//        try {
//            FileOutputStream file = new FileOutputStream("src/main/resources/fileTest2.txt",true);
//            DataOutputStream dataOutputStream = new DataOutputStream(file);
////            dataOutputStream.writeInt(4);
//            dataOutputStream.writeInt(5);
//            file.close();
//            dataOutputStream.close();
//            System.out.println("done");
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }
//
//    }
//     DataOutputStream1();
       DataInputStream1();
    }
    public static void DataOutputStream1() throws Exception{

        File file = new File("src/main/resources/fileTest11.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(1999);
        dataOutputStream.flush();
        dataOutputStream.close();


    }
    public static void DataInputStream1() throws Exception{
        File file = new File("src/main/resources/fileTest11.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        int n = dataInputStream.readInt();
        fileInputStream.close();
        dataInputStream.close();
        System.out.println("Doc file:" + n);

    }
}
