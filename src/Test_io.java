import java.io.*;

public class Test_io {

    public static void main(String[] args) {

        try {



            File file = new File("gushi.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte input[] = new byte[20];
            fileInputStream.read( input);
            String inputstring = new String(input);
            System.out.println(inputstring);
            fileInputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
