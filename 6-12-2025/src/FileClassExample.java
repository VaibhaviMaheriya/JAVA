import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileClassExample {

    public static void main(String[] args) throws IOException {
//        Files.createFile(Path.of("demo.txt"));

//        Files.writeString(Path.of("demo.txt"),"This is a demo file created using Files class.\n");

//        String line = Files.readString(Path.of("demo.txt"));
//
//        System.out.println(line);

//        int count = 1;
//
//
//        List<String> lines = Files.readAllLines(Path.of("demo.txt"));
//        for(String line : lines ){
//            System.out.println("Line "+count+" : "+line);
//            count++;
//        }

//        Files.writeString(Path.of("demo.txt"),"Appending new line in demo file.\n", StandardOpenOption.APPEND);

//        Files.copy(Path.of("demo.txt"),
//                Path.of("demo_copy.txt"),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        System.out.println("Files copied successfully");


//        Files.createDirectories(Path.of("backup.txt"));
//
//
//        Files.move(Path.of("demo_copy.txt")
//        ,Path.of("backup.txt"),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        System.out.println("File moved successfully");


//        Files.delete(Path.of("demo.txt"));
//        System.out.println("File deleted successfully");

//        new File("reports").mkdir();

//        new File("reports/2025/january").mkdirs();


        File folder = new File("reports");

        if(!folder.exists()){
            System.out.println("folder not exists");
            return;
        }

        File[] files = folder.listFiles();

        if(files== null || files.length==0){
            System.out.println("No files found");
            return;
        }
        for(File f : files){
            System.out.println(f.getName());
        }



    }

}
