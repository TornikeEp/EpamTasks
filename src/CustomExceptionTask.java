import org.junit.platform.commons.util.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    Task - create examples of checked and unchecked exceptions.
    Checked:
    If a client can reasonably be expected to recover from an exception,
    we must use checked exception. IncorrectNameException is example of that. We can ask
    to try another file to open.
    If a client cannot do anything to recover from the exception, we must use unchecked exception.
    Example InvalidAgeException. We are getting invalid input.
 */
public class CustomExceptionTask {

    public static void main(String[] args) {
        //Checked
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        CustomExceptionTask customExceptionTask = new CustomExceptionTask();
        try {
            customExceptionTask.openFile(fileName);
        } catch (IncorrectNameException incorrectNameException) {
            System.out.println(incorrectNameException);
        }

        //Unchecked
        System.out.println("Enter the Age to validate :");
        int age = scanner.nextInt();
        if (age > 0 && age < 120) {
            System.out.println("Valid Age entered");
        } else {
            throw new InvalidAgeException("Invalid Age entered");
        }
    }

    public void openFile(String file) throws IncorrectNameException {
        try (Scanner scanner = new Scanner(new File(file))) {
            if (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            if (!isNameCorrect(file)) {
                throw new IncorrectNameException("Name of file in incorrect", fileNotFoundException);
            }
        }
    }

    public boolean isNameCorrect(String fileName) {
        if (StringUtils.isBlank(fileName)) return false;
        return fileName.equals("MyFile");
    }
}
