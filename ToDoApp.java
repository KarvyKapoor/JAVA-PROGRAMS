// importing preprocessor directives
import java.util.ArrayList;
import java.util.Scanner;


public class ToDoApp {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Declaring a array
        ArrayList<String> task = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Display the menu and take user input
        while (true) { 
            System.out.println("To-Do List");
            System.out.println("1. Show Tasks");
            System.out.println("2. Add Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            // Taking user input for menu choice
            int choice=scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline

            // Implementing switch case for menu options
            switch(choice) {
                case 1 -> {
                    // Check if the task list is empty and display tasks
                    if(task.isEmpty()){
                        System.out.println("No Task yet");
                    }else{
                        System.out.println("\nYour Tasks");
                        for (int i = 0; i < task.size(); i++) {
                            System.out.println((i+1) + ". " + task.get(i));
                        }
                    }
                }

                case 2 -> {
                    // Taking user input for new task and adding it to the list
                    System.out.print("Enter the task: ");
                    String newTask = scanner.nextLine();
                    task.add(newTask);
                    System.out.println("Task added");
                }

                case 3 -> {
                    // Check if the task list is empty and take user input for task number to delete
                    if(task.isEmpty()){
                        System.out.println("No Task to delete");
                    }
                    else{
                        System.out.println("Enter task number to delete: ");
                        int num=scanner.nextInt();
                        if(num>0 && num<=task.size()){
                            String removed = task.remove(num-1);
                            System.out.println("Task '" + removed + "' deleted");
                        }
                        else{
                            System.out.println("Invalid task number");
                        }
                    }
                }

                case 4 -> {
                    // Exit the program
                    System.out.println("GoodBye!");
                    scanner.close();
                    return;
                }
                    
                default -> // For invalid menu choice
                    System.out.println("Invalid Choice");
            }
        }
    }
}