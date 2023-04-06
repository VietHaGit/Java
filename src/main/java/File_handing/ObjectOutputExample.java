package File_handing;

import java.io.*;
import java.util.Arrays;

public class ObjectOutputExample {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream("src/main/resources/fileTest124.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
           Stock b = new Stock(3,"ha",330,10);
            oos.writeObject(b);
            //Bước 3: Đóng luồng
            oos.flush();
            oos.close();
            System.out.println("done!");
        } catch (IOException ex) {
            System.out.println("Loi ghi file: "+ex);
        }
    }
}
