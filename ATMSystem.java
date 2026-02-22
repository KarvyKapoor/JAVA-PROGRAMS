// ATM System in Java
import java.util.Scanner;

// Class representing the ATM
class ATM{

    // Instance variable to store balance
    private double balance;

    // Constructor to initialize balance
    public ATM(double balance){
        this.balance=balance;
    }

    // Method to check balance
    public void checkBalance(){
        System.out.println("Your current balance= "+balance);
    }

    // Method to deposit amount
    public void deposit(double amount){

        // Check if the amount is positive before depositing
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Deposited: "+amount);
        }else{
            System.out.println("Invalid amount");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount){

        // Check if the amount is positive and less than or equal to balance before withdrawing
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount Withdrawn: "+amount);
        }else{
            System.out.println("Invalid amount or Insufficient balance");
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the ATM with a starting balance of 1000
        ATM atm = new ATM(1000); // Initialize ATM with 1000

        // Variable to store user's menu choice
        int choice;

        // Display the menu and take user input until they choose to exit
        do { 
            System.out.println("ATM System");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            
            // Implementing switch case for menu options
            switch(choice) {
                case 1:
                    // Call the method to check balance
                    atm.checkBalance();
                    break;

                case 2:
                    // Take user input for deposit amount and call the method to deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    // Take user input for withdraw amount and call the method to withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    // For invalid menu choice
                    System.out.println("Invalid choice!");
            }
        } while (choice!=4);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}