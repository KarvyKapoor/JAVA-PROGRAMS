// importing required prerequistes
import java.util.Scanner;

// Execution starts here
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input and a StudentService object to manage students
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        // Main loop to display menu and handle user choices
        while(true){
            System.out.println("Student Management System");
            System.out.println("1. Add Student"); 
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handle user choice using a switch statement
            switch(choice){
                case 1 -> {
                    // Prompt user for student details and add the student to the service
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    service.addStudent(new Student(id, name, age, course));
                }

                case 2 -> // View all students by calling the viewAll method of the service
                    service.viewAll();

                case 3 -> {
                    // Prompt user for ID and search for the student using the searchById method of the service
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    
                    // If student is found, print the student details; otherwise, print "Student not found"
                    Student s = service.searchById(searchId);
                    if(s!=null){
                        System.out.println(s);
                    }else{
                        System.out.println("Student not found");
                    }
                }

                case 4 -> {
                    // Prompt user for ID and delete the student using the deleteStudent method of the service
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    service.deleteStudent(deleteId);
                }

                case 5 -> {
                    // Exit the program by printing a goodbye message, closing the scanner, and returning from the main method
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }   
    }
}