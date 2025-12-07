import java.io.*;
import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");

        String word = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader("cities.txt"));

            String line ;
            boolean found = false;

            while((line = br.readLine())!= null){
                if(line.contains(word)){
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println("found");
            }else {
                System.out.println("not found");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
