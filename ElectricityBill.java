package BASICS;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an units :");
        int units = scanner.nextInt();
        int bill = 0;
        if (units>100){
            if(units>200){
                if (units>300){
                    bill=units*8;
                }
                else{
                    bill=units*6;
                }
            }
            else{
                bill=units*5;
            }
        }
        System.out.println("UNITS Consumed : " + units);
        System.out.println("BILL : "+ bill);
    }
}
