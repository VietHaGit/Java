package File_handing;

import java.io.*;

public class ObjectOutputExample {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream("src/main/resources/fileTest3.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Khai báo mảng
            Stock s[] = {
                    new Stock(1, "CD ROM", 100, 2)
                    ,new Stock(2, "CPU", 500, 2)
                    ,new Stock(3, "HP Scanner", 75, 1)
            };
            //Bước 2: Ghi mảng đối tượng vào file
            oos.writeObject(s);
            //Bước 3: Đóng luồng
            fos.close();
            oos.close();
            System.out.println("done!");
        } catch (IOException ex) {
            System.out.println("Loi ghi file: "+ex);
        }
    }
}
