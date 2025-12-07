import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISandFOS {
    public static void main(String[] args) {

        try {
//            FileOutputStream fis = new FileOutputStream("binary.dat");
//            fis.write("Hello Java".getBytes());
//            fis.close();

//            FileInputStream fis = new FileInputStream("binary.dat");
//            int ch;
//
//            while ((ch = fis.read())!=-1){
//                System.out.println((char) ch);
//            }
//            fis.close();


            FileInputStream fis = new FileInputStream("picture.jpg");

            FileOutputStream fos = new FileOutputStream("image.jpg");

            int data;

            while((data= fis.read())!= -1){
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File copied Successfully");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
