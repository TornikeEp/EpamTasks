import java.io.*;

/*
    Task - create example of suppressed exception and get information about it.
 */

public class SuppressedExceptionTask {

    public static void main(String[] args) {
        SuppressedExceptionTask suppressedExceptionTask = new SuppressedExceptionTask();
        try {
            suppressedExceptionTask.openFile("");
        } catch (Exception exception) {
            Throwable[] suppressedExceptions = exception.getSuppressed();
            for (Throwable throwable : suppressedExceptions) {
                System.out.println(throwable);
            }
        }
    }

    /*
        In general, it's not a good idea to catch nullPointerException but for now it is a
        good example how one exception can be suppressed by another.
     */
    public void openFile(String filePath) throws IOException {
        BufferedReader reader = null;
        Throwable throwable = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (IOException ioException) {
            throwable = ioException;
        } finally {
            try {
                reader.close();
            } catch (NullPointerException nullPointerException) {
                nullPointerException.addSuppressed(throwable);
                throw nullPointerException;
            }
        }
    }
}
