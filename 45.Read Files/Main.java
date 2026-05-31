import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        // Read a file using Java (3 popular options)

        // BufferedReader + FileReader = Best for reading text file line by line.
        // FileInputStream = Best for reading binary files.
        // RandomAccessFile = Best for read/write specific portions of a large file.

        String filePath = "C:\\Users\\Moin\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            //It can also be done manually but its too time consuming.
            // System.out.println(reader.readLine()); // reads first line
            // System.out.println(reader.readLine()); // reads second line
        } 
        catch(FileNotFoundException e){
            System.out.println("File not found: " + filePath);
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}