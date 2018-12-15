import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_io {
    public static void main(String[] args) {
        try {



            FileInputStream fileInputStream = new FileInputStream("gushi.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("new_gushi.txt");

            byte[] bytes = new byte[50];
            while (fileInputStream.read(bytes) != -1){

                fileOutputStream.write(bytes);

            }
            fileInputStream.close();
            fileOutputStream.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
