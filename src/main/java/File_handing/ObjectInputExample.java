package File_handing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputExample {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream("src/main/resources/fileTest3.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Bước 2: Đọc dữ liệu
            Stock sArr[] = (Stock[]) ois.readObject();
            for(Stock s : sArr){
                System.out.println(s.toString());
            }
            //Bước 3: Đóng luồng
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: "+ex);
        }
    }
}
