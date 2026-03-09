package FileHandling;
import java.io.*;
import java.util.Scanner;
public class BasicInOne {
    static String fileName; // hold the current target file name
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\nFile Handling in Java Menu");
                System.out.println("1. Create File\n2. Write to File\n3. Append to File\n4. Read File\n5. Delete File\n6. Exit");
                
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline
                
                if (choice >= 1 && choice <= 5) {
                    System.out.print("Enter file name on which you want to perform operation: ");
                    fileName = sc.nextLine();
                }
                
                switch (choice) {
                    case 1 -> createFile();
                    case 2 -> writeFile();
                    case 3 -> appendFile();
                    case 4 -> readFile();
                    case 5 -> deleteFile();
                    case 6 -> System.out.println("Exiting program.");
                    default -> System.out.println("Invalid choice, please try again.");
                }
            } while (choice != 6);
        }
    }

    // 1 Create file
    static void createFile() {
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("Error creating file");
        }
    }

    // 2 Write into file
    static void writeFile() {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello Java File Handling\n");
            writer.write("This is first write operation by Karvy Kapoor\n");
            System.out.println("Writting to file");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

    // 3 Append data
    static void appendFile() {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("This line is appended or this is new line added by Karvy Kapoor\n");
            System.out.println("Data appended");
        } catch (IOException e) {
            System.out.println("Error appending file");
        }
    }

    // 4 Read file
    static void readFile() {
        File file = new File(fileName);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    // 5 Delete file
    static void deleteFile() {
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not deleted");
        }
    }
}