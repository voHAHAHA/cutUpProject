import java.io.FileInputStream;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D://9Работа с файлами//Hello.txt")) {
            System.out.printf("File size: %d bytes \n", fis.available());

            int i = -1;
            while((i = fis.read()) != -1) {
                System.out.println((char)i);
            }
        } catch (IOException exe){
            System.out.println(exe.getMessage());
        }
    }
}
