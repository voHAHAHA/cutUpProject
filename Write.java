import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String text = "Hello world";
        try (FileOutputStream fos = new FileOutputStream("D://9Работа с файлами//Hello.txt")){

            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
