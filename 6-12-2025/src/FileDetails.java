import java.io.File;

public class FileDetails {
    public static void main(String[] args) {

        File f = new File("employee.txt");

        System.out.println("Absolute Path : "+ f.getAbsolutePath());

        System.out.println("Last Modified Time : "+f.lastModified());

        System.out.println("File size : "+f.length());
    }
}
