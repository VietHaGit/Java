package File_handing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectWriter {
    public static void main(String[] args) {
        File file = new File("file.dat");
        boolean append = file.exists(); // if file exists then append, otherwise create new

        try (
                FileOutputStream fout = new FileOutputStream(file, append);
                AppendableObjectOutputStream oout = new AppendableObjectOutputStream(fout, append);
        ) {

//            oout.writeObject(); // replace "..." with serializable object to be written
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
