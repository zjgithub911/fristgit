import java.io.*;

public class Test_buffered_in {
    public static void main(String[] args) {
        File file = new File("gushi.txt");
        try {



            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] bytes = new byte[50];
            while (bufferedInputStream.read()!= -1){
                System.out.println(bytes);


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
