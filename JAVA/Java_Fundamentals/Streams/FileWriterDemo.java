import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Hello Java\n");
            writer.write("FileWriter Example");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}