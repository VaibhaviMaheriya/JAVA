import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {


//        Exercise 1: Create a file

        File f = new File("employee.txt");

        try {
            if(f.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
