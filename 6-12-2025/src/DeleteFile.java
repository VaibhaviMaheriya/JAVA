import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("employee.txt");

        if(f.delete()){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("file not exists");
        }
    }
}
