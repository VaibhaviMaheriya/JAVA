import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCharInFIle {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");

            int ch ;
            int count = 0;
            while((ch = fr.read())!=-1){
                count++;
            }
            System.out.println("Count : "+count);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
