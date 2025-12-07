import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFIle {
    public static void main(String[] args) {
        try {
//            FileWriter fw = new FileWriter("data.txt");
//            fw.write("name : Vaibhavi" +
//                    "\nDepartment : IT" +
//                    "\nLocation : Ahmedabad");
//
//            fw.close();
            FileWriter fw =  new FileWriter("data.txt", true);
            fw.write("\nname : Amit" +
                    "\nDepartment : HR");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
