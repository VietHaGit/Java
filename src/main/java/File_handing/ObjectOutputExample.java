package File_handing;

import java.io.*;
import java.util.Arrays;

public class ObjectOutputExample {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream("src/main/resources/fileTest123.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Khai báo mảng
//            Stock s = new Stock(1, "CD ROM", 100, 2);
//            Stock s1 = new Stock(2, "ASDASD", 100, 2);
            Stock s2 = new Stock(3, "ASDASD", 100, 2);
            Stock s3 = new Stock(5, "43234", 100, 2);
            //Bước 2: Ghi mảng đối tượng vào file
            oos.writeObject(s3);
            //Bước 3: Đóng luồng
            fos.close();
            oos.close();
            System.out.println("done!");
        } catch (IOException ex) {
            System.out.println("Loi ghi file: "+ex);
        }
    }
}
