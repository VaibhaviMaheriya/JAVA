import java.io.*;

public class Writeline {
    public static void main(String[] args) throws IOException {

//        File file =  new File("cities.txt");
//        file.createNewFile();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("cities.txt"));
            bw.write("Pune\n" +
                    "Mumbai\n" +
                    "Delhi\n" +
                    "Bangalore\n" +
                    "Hyderabad\n");
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
