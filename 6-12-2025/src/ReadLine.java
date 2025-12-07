import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line ;
            int count =1;
            while((line = br.readLine())!=null){
                System.out.println("Line"+count++ +" : "+ line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
