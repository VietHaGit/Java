package File_handing;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelApp {
    public static void main(String[] args) throws Exception {
//FileChannel1();
        FileChannel2();
    }
    public static void FileChannel1() throws Exception{
        RandomAccessFile stream = new RandomAccessFile(new File("Src/main/resources/file11.txt"),"rw");
        FileChannel channel = stream.getChannel();
        String value = "Hello";
        byte[] strBytes = value.getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
        buffer.put(strBytes);
        buffer.flip();
        channel.write(buffer);
        stream.close();
        channel.close();
    }
    public static void FileChannel2()throws Exception{
        RandomAccessFile stream = new RandomAccessFile(new File("Src/main/resources/file11.txt"),"rw");
        String channel = String.valueOf(stream.read());
        System.out.println(channel);
        stream.close();

    }
}
