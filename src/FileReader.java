import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileReader {

    /*
        Task reformat code of reading file.
     */
    public static void readFile(File file) {
        String line = "";
        RandomAccessFile input = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ioException) {
                    System.out.println(ioException);
                }
            }
        }
    }

    public static void main(String[] args) {
        readFile(new File(""));
    }
}
