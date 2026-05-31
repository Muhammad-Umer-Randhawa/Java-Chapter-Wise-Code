import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        // How to write a file using java (4 popular options)
        
        // FileWriter = Good for small or medium sized text files.
        // BufferedWriter = Good for writing large text files.
        // PrintWriter = Good for writing formatted text files. Best for structures data like reports or logs
        // Files.write() = Good for writing files in a single call. Best for binary files(e.g, images or audio files).

        try(FileWriter writer = new FileWriter("test.txt")) { //if not using try and catch you have to close the writer manually with writer.close()
            writer.write("Hello, World!");
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("Couldnt write file");
        }
    }
}